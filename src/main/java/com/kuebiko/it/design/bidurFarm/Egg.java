package com.kuebiko.it.design.bidurFarm;

import com.kuebiko.it.design.bidurFarm.exception.NotYetImplementedException;

import java.util.concurrent.*;

public final class Egg {

  private Bird bird;

  private boolean isAlreadyHatched;

  public Egg(Callable<Bird> birdCallable) {
    ScheduledExecutorService executorService= Executors.newScheduledThreadPool(1);
    Future<Bird> future= executorService.submit(birdCallable);
    try {
      bird= future.get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  public Egg(Bird bird) {
    this.bird=bird;
  }
  public Bird getBird() {
    return this.bird;
  }

  @Override
  public String toString() {
    return "Egg{" +
            "bird=" + bird +
            '}';
  }
}
