package com.kuebiko.it.rab3;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {

  Calculation classUnderTest = new Calculation();

  @Test
  public void add() {
    int result = classUnderTest.add(10, 5);

    Assert.assertEquals(15, result);
  }

  @Test
  public void add_negative() {
    int result = classUnderTest.add(-10, 5);

    Assert.assertEquals(-5, result);
  }

  @Test
  public void add_unhappyPath() {
    int result = classUnderTest.add(null, 5);

    Assert.assertEquals(-5, result);
  }
}
