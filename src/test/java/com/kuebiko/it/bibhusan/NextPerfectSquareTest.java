package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPerfectSquareTest {
    private NextPerfectSquare nps= new NextPerfectSquare();
    @Test
    public void getNextPerfectSquareTest1() {

        //Given num(Integer)
        int num= 16;

        //When(Act)
        int actual = nps.getNextPerfectSquare(num);

        //Then(Assert)
        int expected = 25;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNextPerfectSquareTest2() {

        //Given num(Integer)
        int num= 23;

        //When(Act)
        int actual = nps.getNextPerfectSquare(num);

        //Then(Assert)
        int expected = -1;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNextPerfectSquareTest3() {

        //Given num(Integer)
        int num= 1;

        //When(Act)
        int actual = nps.getNextPerfectSquare(num);

        //Then(Assert)
        int expected = 4;
        Assert.assertEquals(expected,actual);
    }
}