package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class printFuzzBuzzTest {

    @Test
    public void getFuzzBuzz() {
        String expected="FIZZBUZZ";
        int input=15;
        String actual= PrintFuzzBuzz.fuzz(input);
        assertEquals (expected,actual);

    }
    @Test
    public void getFIZZ() {
        String expected="FIZZ";
        int input=9;
        String actual= PrintFuzzBuzz.fuzz(input);
        assertEquals (expected,actual);

    }
    @Test
    public void getBuzz() {
        String expected="BUZZ";
        int input=10;
        String actual= PrintFuzzBuzz.fuzz(input);
        assertEquals (expected,actual);

    }
    @Test
    public void getRandom() {
        String expected= "1";
        int input=1;
        String actual= PrintFuzzBuzz.fuzz(input);
        assertEquals (expected,actual);

    }
}