package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.FindHighestSum;
import com.kuebiko.it.ashrit.FindLimitFactorial;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLimitFactorialTest {
    FindLimitFactorial findLimitFactorial = new FindLimitFactorial();

    @Test
    public void findLimitFactorial() {
        long k = findLimitFactorial.findLimitFactorial(7, 2);

        Assert.assertEquals(42, k);
    }


    @Test
    public void findLimitFactorial1() {
        long k = findLimitFactorial.findLimitFactorial(4, 1);

        Assert.assertEquals(4, k);
    }

    @Test
    public void findLimitFactorial2() {
        long k = findLimitFactorial.findLimitFactorial(21, 4);

        Assert.assertEquals(143640, k);
    }
}