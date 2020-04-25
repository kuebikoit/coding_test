package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Chicken implements Bird {

  private final String name;

  //private static final long HATCHING_PERIOD_MINS = initialize();

  private List<Egg> eggs = new ArrayList<>(100);

  public Chicken(String name) throws FileNotFoundException {
    this.name = name;
  }

  static long initialize() throws Exception {


    File confResource =null;
    FileInputStream fis=null;

      confResource = new File("bird.properties");
      fis = new FileInputStream(confResource);
      Properties prop = new Properties();
      prop.load(fis);
      String period = prop.getProperty("incubation.period.minutes.chicken");


    throw new NotYetImplementedException("get from src/main/resources/farm/bird.properties");
  }

  @Override
  public Egg lay() {
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));

    throw new NotYetImplementedException("add it to eggs after its laid");

    //System.out.println(String.format("total egg count is %s", eggs.size()));
  }
}
