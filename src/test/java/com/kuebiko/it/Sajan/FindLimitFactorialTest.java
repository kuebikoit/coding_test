package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

public class FindLimitFactorialTest {

    @Test
    public void findLimitFactorialtester() {
        FindLimitFactorial lim = new FindLimitFactorial();
        long actual = lim.findLimitFactorial(5,5);
        Assert.assertEquals(120, actual);
    }

    @Test
    public void findLimitFactorialtester2() {
        FindLimitFactorial lim = new FindLimitFactorial();
        long actual = lim.findLimitFactorial(10,1);
        Assert.assertEquals(10, actual);
    }
}