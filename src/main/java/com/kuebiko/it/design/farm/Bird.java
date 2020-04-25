package com.kuebiko.it.design.farm;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public interface Bird {
  Egg lay() throws IOException, ExecutionException, InterruptedException, Exception;
}
