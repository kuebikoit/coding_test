package SanjiT2.farm;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
