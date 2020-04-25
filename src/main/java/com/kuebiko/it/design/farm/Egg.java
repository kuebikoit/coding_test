package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;

import java.util.concurrent.*;

public final class Egg {

  private final Bird bird;
  private boolean isAlreadyHatched;


  public Egg(Callable<Bird> birdCallable) throws Exception {
    this.bird = birdCallable.call();
    this.isAlreadyHatched=true;
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
