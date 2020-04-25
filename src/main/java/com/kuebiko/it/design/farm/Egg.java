package com.kuebiko.it.design.farm;

//import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

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
