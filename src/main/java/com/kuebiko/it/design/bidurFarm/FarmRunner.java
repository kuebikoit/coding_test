package com.kuebiko.it.design.bidurFarm;

import java.util.concurrent.*;

public class FarmRunner {

  private static final ExecutorService executorService = Executors.newFixedThreadPool(5);

  public static void main(String[] args) {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Bird myChicken = new Chicken("potent hen");

    scheduler.scheduleAtFixedRate(() -> simulate(myChicken), 2, 10, TimeUnit.SECONDS);
  }

  static void simulate(Bird bird) {
    executorService.submit(bird::lay);
  }
}