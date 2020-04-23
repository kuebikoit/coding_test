package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import java.util.concurrent.*;

public final class Egg {

  private final Bird bird;

  private boolean isAlreadyHatched;


  public Egg(Callable<Bird> birdCallable) throws ExecutionException, InterruptedException {
    this.isAlreadyHatched=true;
    ExecutorService executor =  Executors.newSingleThreadScheduledExecutor();
    Future<Bird> birdFuture= executor.submit(birdCallable);
    this.bird=birdFuture.get();
  }

  public Bird getBird() {
    return this.bird;
  }
}
