package SecondTestSafal;

import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FarmRunner {

  private static final ExecutorService executorService = Executors.newFixedThreadPool(5);

  public static void main(String[] args) throws FileNotFoundException {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    Bird myChicken = new Chicken("potent hen");

    scheduler.scheduleAtFixedRate(() -> simulate(myChicken), 2, 10, TimeUnit.SECONDS);
  }

  static void simulate(Bird bird) {
    executorService.submit(bird::lay);
  }
}
