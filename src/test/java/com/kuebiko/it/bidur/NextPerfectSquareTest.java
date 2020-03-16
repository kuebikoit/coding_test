package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPerfectSquareTest {

    @Test
    public void getNextPerfectSquare() {
        int num = 16;
        NextPerfectSquare next = new NextPerfectSquare();
        int result = next.getNextPerfectSquare(num);
        Assert.assertEquals(25, result);
    }

    @Test
    public void checkPercect() {
        int num = 16;
        NextPerfectSquare next = new NextPerfectSquare();
        boolean result = next.checkPercect(num);
        Assert.assertEquals(true, result);
    }

    @Test
    public void getNextPerfectSquare1() {
        int num = 23;
        NextPerfectSquare next = new NextPerfectSquare();
        int result = next.getNextPerfectSquare(num);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void checkPercect1() {
        int num = 23;
        NextPerfectSquare next = new NextPerfectSquare();
        boolean result = next.checkPercect(num);
        Assert.assertEquals(false, result);
    }
}