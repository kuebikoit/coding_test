package com.kuebiko.it.design.farm;

import com.kuebiko.it.design.farm.exception.NotYetImplementedException;
import java.util.concurrent.Callable;

public final class Egg {

  private final Bird bird;

  public boolean isAlreadyHatched() {
    return isAlreadyHatched;
  }

  public void setAlreadyHatched(boolean alreadyHatched) {
    isAlreadyHatched = alreadyHatched;
  }

  private boolean isAlreadyHatched;

  public Egg(Callable<Bird> birdCallable) throws Exception {

    this.bird = birdCallable.call();
    isAlreadyHatched = true;

  }

  public Bird getBird() {
    return this.bird;
  }
}
