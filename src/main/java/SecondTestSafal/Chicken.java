package SecondTestSafal;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Chicken implements Bird {

  private  final String name;

  private static final long HATCHING_PERIOD_MINS = initialize();

  private List<Egg> eggs = new ArrayList<>(100);

  public Chicken(String name) {
    this.name = name;
  }

  static long initialize() {
    FileInputStream fileInputStream = null;
    File confResource = new File("src/main/resources/farm/bird.properties");
    try {
      fileInputStream = new FileInputStream(confResource);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    Properties prop = new Properties();
    try {
      prop.load(fileInputStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
    String period = prop.getProperty("incubation.period.minutes.chicken");
    long timer = Integer.parseInt(period);
    return timer;

  }

  @Override
  public Egg lay() throws Exception {
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));
    Egg egg=new Egg(this::Hatched);
    this.eggs.add(egg);
    System.out.println(egg.isAlreadyHatched);
    return egg;
  }

   private Bird Hatched() {
    try{
      Thread.sleep(HATCHING_PERIOD_MINS*60000);
      String filePath="src/main/resources/farm/egg.csv";
      RecordHatchedEgg(filePath,this.name,LocalDateTime.now());
    }catch (Exception e){
      e.printStackTrace();
    }
    return null;
  }

  public static void RecordHatchedEgg(String filePath, String name, LocalDateTime hatchedTime){
    try(FileWriter fileWriter=new FileWriter(filePath,true);
        CSVWriter csvWriter=new CSVWriter(fileWriter);){
      String[] data={name,hatchedTime.toString()};
      csvWriter.writeNext(data);
    }catch (Exception e){
      e.printStackTrace();
    }
  }

}



