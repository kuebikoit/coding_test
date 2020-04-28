package com.kuebiko.it.design.farm;

import java.util.concurrent.*;

public final class Egg {

  private Bird bird;

  private boolean isAlreadyHatched;


  public Egg(Callable<Bird> birdCallable) {

    //throw new NotYetImplementedException("when timer expires isAlreadyHatched = true");

    //check if valid
    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
    Future<Bird> future = executorService.submit(birdCallable);
    try {
      bird = future.get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    return "Egg{" +
            "bird=" + bird +
            '}';
  }

  public Bird getBird() {
    return this.bird;
  }
}