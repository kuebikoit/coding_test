package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;
import com.opencsv.CSVWriter;

import java.io.*;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;

public class Chicken implements Bird {

  private final String name;

  private static final long HATCHING_PERIOD_MINS = initialize();

  private static final String propurl = "C:\\Users\\Ashrit\\Documents\\coding_test\\src\\main\\resources\\farm\\bird.properties";
  private final String CSVpath = "C:\\Users\\Ashrit\\Documents\\coding_test\\src\\main\\resources\\farm\\egg.csv";
  private List<Egg> eggs = new ArrayList<>(100);
  private LocalDateTime l, l1;

  public Chicken(String name) {
    this.name = name;
  }

  static long initialize()  {
    InputStream input = null;
    try {
      input = new FileInputStream(propurl);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    Properties prop = new Properties();
    try {
      prop.load(input);
    } catch (IOException e) {
      e.printStackTrace();
    }
    String inc=prop.getProperty("incubation.period.minutes.chicken");
    int incubation_chicken = Integer.parseInt(inc);
    return incubation_chicken;
    //throw new NotYetImplementedException("get from src/main/resources/farm/bird.properties");
  }

  @Override
  public Egg lay() throws Exception {
    //boolean s=true;
     l = LocalDateTime.now();
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, l));

    Egg egg = new Egg(this::hatch_period);
    System.out.println(String.format("Egg laid at %s Hatched an egg at %s", l, l1));

    this.eggs.add(egg);
    writeInCsv(this.name,l,l1);
    return egg;

  }


public Chicken hatch_period() throws InterruptedException {
    int incubation_period= (int)HATCHING_PERIOD_MINS *60*1000; //
    Thread.sleep(incubation_period);
    this.l1 = LocalDateTime.now();
    return this;
}

private void writeInCsv(String s, LocalDateTime l, LocalDateTime l1){
  File file = new File(CSVpath);
  try {
    // create FileWriter object with file as parameter
    FileWriter outputfile = new FileWriter(file,true);

    // create CSVWriter object filewriter object as parameter
    CSVWriter writer = new CSVWriter(outputfile);

    // add data to csv
    String[] data1 = { s +" Laid at"+" "+ l +" "+ "&" + " Hatch at "+l1 };
    writer.writeNext(data1);

    // closing writer connection
    writer.close();
  }
  catch (IOException e) {
    e.printStackTrace();
  }
}



//  private void newMethod(){
//    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//    Runnable r = ()-> new Chicken("Chicken Hatch");
//
//    scheduledExecutorService.schedule(r,initialize(),TimeUnit.MICROSECONDS);
//  }
}
