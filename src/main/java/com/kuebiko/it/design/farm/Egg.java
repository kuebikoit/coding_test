package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import java.util.concurrent.*;

public final class Egg {

  private final Bird bird;

  private boolean isAlreadyHatched;

  int numberOfEggsHatched = 0;

  public Egg(Callable<Bird> birdCallable) throws InterruptedException, ExecutionException {
    Thread.sleep(21*1000);

    ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
    Future<Bird> newBornBird = scheduled.submit(birdCallable);
    isAlreadyHatched = true;

    if (isAlreadyHatched == true){
      System.out.println(numberOfEggsHatched+1 +" egg/s hatched...");
    }
    isAlreadyHatched =false;
    bird = newBornBird.get();
    //throw new NotYetImplementedException("when timer expires isAlreadyHatched = true");
  }

  public Bird getBird() {
    return this.bird;
  }
}
