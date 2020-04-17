package com.kuebiko.it.karya;

import org.junit.Assert;
import org.junit.Test;

public class VoidMethodTest {

  VoidMethod classUnderTest = new VoidMethod();

  @Test
  public void calculate() {
    classUnderTest.calculate(3, 5);

    Assert.assertEquals(-2, classUnderTest.getC());
  }

  @Test
  public void modifyPOJO() {
    POJO inst = new POJO();

    classUnderTest.modifyPOJO(inst);

    Assert.assertEquals("Saransh", inst.getField1());
    Assert.assertEquals(100, inst.getValue());
  }
}
