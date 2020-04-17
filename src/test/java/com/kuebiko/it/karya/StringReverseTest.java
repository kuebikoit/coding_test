package com.kuebiko.it.karya;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {

  private StringReverse stringReverseUnderTest = new StringReverse();

  @Test
  public void test_1() {
    String input = "input-1";

    String output = stringReverseUnderTest.reverse(input);

    Assert.assertEquals("1-tupni", output);
  }

  @Test
  public void test_2() {
    String input = "input-1";

    String output = stringReverseUnderTest.reverse(input);

    Assert.assertNotEquals("bad_expectation", output);
  }
}
