package com.kuebiko.it.design.farm;

import java.util.concurrent.Callable;

public final class Egg {

  public boolean isAlreadyHatched;
  private  Bird bird;


  public Egg(Callable<Bird> birdCallable) {
    try {
      this.bird = birdCallable.call();
      isAlreadyHatched=true;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Bird getBird() {
    return this.bird;
  }


}
