package SanjiT2.farm;

import SanjiT2.farm.exception.NotYetImplementedException;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

public class Chicken implements Bird {

  private static final long HATCHING_PERIOD_MINS = initialize();
  private static List<Egg> eggs = new ArrayList<>(100);
  private final String name;

  public Chicken(String name) {

    this.name = name;
  }

  @Override
  public String toString() {
    return "Chicken{" +
            "name='" + name + '\'' +
            '}';
  }

  // 1. loads the value of incubation.period.minutes.chicken in HATCHING_PERIOD_MINS
  static long initialize() {
    long incubationPeriod = 0L;
      try(InputStream input =  new FileInputStream("/Users/Sanji/Documents/GitHub/coding_test/src/main/resources/farm/bird.properties")){
        Properties properties = new Properties();
        properties.load(input);
        incubationPeriod = Long.parseLong(properties.getProperty("incubation.period.minutes.chicken"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    return incubationPeriod;
  }


  //2. implemented method lay() which uses HATCHING_PERIOD_MINS when egg is laid, and sets isAlreadyHatched to true
  @Override
  public Egg lay() throws Exception {
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));

    ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
    Future <Bird> eggLaid = ses.schedule(()->this, HATCHING_PERIOD_MINS, TimeUnit.SECONDS);

    Egg egg = new Egg(eggLaid::get);
    eggs.add(egg);
    Chicken.addRecord("egg.csv",LocalDateTime.now());
    return egg;
  }

  //3. Writes the record to csv file when egg us hatched
  private static void addRecord(String filePath, LocalDateTime hatchedTime){
    new File(filePath);
    try{
      FileWriter recordFile = new FileWriter("egg.csv");
      CSVWriter writer = new CSVWriter(recordFile);

      String [] header = {"Bird","Hatched Time"};
      writer.writeNext(header);
      String[] data = {hatchedTime.toString()};
      writer.writeNext(data);
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
/*  private  Bird incubation() {
   try{
     Thread.sleep(HATCHING_PERIOD_MINS);
   } catch (InterruptedException e) {
     e.printStackTrace();
   }
   return null;
  }*/

}



