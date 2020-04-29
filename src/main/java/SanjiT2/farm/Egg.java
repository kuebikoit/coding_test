package SanjiT2.farm;

import SanjiT2.farm.exception.NotYetImplementedException;

import java.util.concurrent.*;

public final class Egg {

  private final Bird bird;

  private boolean isAlreadyHatched;

  public Egg(Callable<Bird> birdCallable) throws Exception {
    this.isAlreadyHatched = true;
    System.out.println("Egg Hatched? " + isAlreadyHatched);

    ExecutorService es = Executors.newFixedThreadPool(1);
    Future<Bird> eggLaid = es.submit(birdCallable);
    this.bird = eggLaid.get();

  }

  public Bird getBird(){
    return this.bird;
  }

}