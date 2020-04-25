package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPerfectSquareTest {

    @Test
    public void getNextPerfectSquareTester() {
        NextPerfectSquare perfect = new NextPerfectSquare();
        int actual = perfect.getNextPerfectSquare(81);
        Assert.assertEquals(100, actual);
    }

    @Test
    public void getNextPerfectSquareTester2() {
        NextPerfectSquare perfect = new NextPerfectSquare();
        int actual = perfect.getNextPerfectSquare(77);
        Assert.assertEquals(-1, actual);
    }
}