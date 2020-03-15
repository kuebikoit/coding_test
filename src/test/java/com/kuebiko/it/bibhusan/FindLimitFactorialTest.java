package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class FindLimitFactorialTest {

     private FindLimitFactorial flf = new FindLimitFactorial();
    @Test
    public void findLimitFactorialTest1() {

        //Given number
        int num= 7;

        //Given limit
        int limit=2;

        //When(Act)
        long actual = flf.findLimitFactorial(num,limit);

        //Then(Assert)
        long expected = 42;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void findLimitFactorialTest2() {

        //Given number
        int num= 4;

        //Given limit
        int limit=5;

        //When(Act)
        long actual = flf.findLimitFactorial(num,limit);

        //Then(Assert)
        long expected = 0;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void findLimitFactorialTest3() {

        //Given number
        int num= 21;

        //Given limit
        int limit=4;

        //When(Act)
        long actual = flf.findLimitFactorial(num,limit);

        //Then(Assert)
        long expected = 143640;
        Assert.assertEquals(expected,actual);

    }
}