package com.kuebiko.it.design.bidurFarm;

import java.util.concurrent.ExecutionException;

public interface Bird {
  Egg lay() throws ExecutionException, InterruptedException;
}
