package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//import com.sun.xml.internal.stream.buffer.sax.Properties;

public class Chicken implements Bird {

  private final String name;

  private static long HATCHING_PERIOD_MINS;

  static {
    try {
      HATCHING_PERIOD_MINS = initialize();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private List<Egg> eggs = new ArrayList<>(100);

  public Chicken(String name) {
    this.name = name;
  }


  static long initialize() throws IOException {

    try (FileReader reader = new FileReader("C:\\Users\\Roshan\\Documents\\SPRING 2020\\cubic\\coding_test\\src\\main\\resources\\farm\\bird.properties")) {
      Properties properties = new Properties();
      properties.load(reader);

      String hatchingTime = properties.getProperty("incubation.period.minutes.chicken");
      long finalHatchingTime = Integer.parseInt(hatchingTime);
      return finalHatchingTime;
    } catch (Exception e) {
      e.printStackTrace();
    }
    throw new NotYetImplementedException("get from src/main/resources/farm/bird.properties");
  }


  @Override
  public Egg lay() throws IOException {
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));

    Egg egg = new Egg(this::incubation);
    this.eggs.add(egg);

    System.out.println("eggs:" + eggs);
    System.out.println("egg hatched?: " + egg.isAlreadyHatched);

    throw new NotYetImplementedException("add it to eggs after its laid");

    //System.out.println(String.format("total egg count is %s", eggs.size()));
  }


  private Chicken incubation() {
    try {
      Thread.sleep(21*1000 );
      EggCsv();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return null;

  }


  private void EggCsv()  {

    //Write into egg.csv
    String filepath = "src/main/resources/farm/egg.csv";
    FileWriter fw = null;
    try {
      fw = new FileWriter(filepath,true);
    } catch (IOException e) {
      e.printStackTrace();
    }
    CSVWriter writer = new CSVWriter(fw);

    String[] bird_type = {this.name, String.valueOf(LocalDateTime.now())};

    writer.writeNext(bird_type);
    try {
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }


  }


}
