package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chicken implements Bird {

  private final String name;

  //private static final long HATCHING_PERIOD_MINS = initialize();
  //private static final long HATCHING_PERIOD_MINS = incubation.period.minutes.chicken;

  private List<Egg> eggs = new ArrayList<>(100);

  public Chicken(String name) {
    this.name = name;
  }

  static long initialize() {
    throw new NotYetImplementedException("get from src/main/resources/farm/bird.properties");
  }

  @Override
  public Egg lay() {
    System.out.println(String.format("chicken(%s) laid an egg at %s", name, LocalDateTime.now()));

    throw new NotYetImplementedException("add it to eggs after its laid");

    //System.out.println(String.format("total egg count is %s", eggs.size()));
  }
}
