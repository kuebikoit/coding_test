package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class NextPerfectSquareTest {

  @Test
  public void getNextPerfectSquare() {
    //AAA -> Arrange Act Assert
    NextPerfectSquare inst = new NextPerfectSquare();

    int number = inst.getNextPerfectSquare(16);

    Assert.assertEquals(25, number);
  }

  @Test
  public void getNextPerfectSquare_checkNegative() {
    NextPerfectSquare inst = new NextPerfectSquare();

    int number = inst.getNextPerfectSquare(15);

    Assert.assertEquals(-1, number);
  }
}
