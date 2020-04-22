package com.kuebiko.it.design.bidurFarm;

import com.kuebiko.it.design.bidurFarm.exception.NotYetImplementedException;

import java.util.concurrent.Callable;

public final class Egg {

  private final Bird bird;

  private boolean isAlreadyHatched;

  public Egg(Callable<Bird> birdCallable) {
    throw new NotYetImplementedException("when timer expires isAlreadyHatched = true");
  }

  public Bird getBird() {
    return this.bird;
  }
}
