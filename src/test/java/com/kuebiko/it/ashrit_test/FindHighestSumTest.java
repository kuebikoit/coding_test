package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.FindHighestSum;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHighestSumTest {
    FindHighestSum findHighestSum = new FindHighestSum();

    @Test
    public void findHighestSum() {
        int[] arr = {5, 2, 3, 4, 1};
        int l = findHighestSum.findHighestSum(arr, 3);

        Assert.assertEquals(12, l);
    }

    @Test
    public void findHighestSum1() {
        int[] arr = {1, 11, 111};
        int l = findHighestSum.findHighestSum(arr, 1);

        Assert.assertEquals(111, l);
    }

    @Test
    public void findHighestSum2() {
        int[] arr = {3, 7, 2, 5};
        int l = findHighestSum.findHighestSum(arr, 2);

        Assert.assertEquals(12, l);
    }

    @Test
    public void findHighestSum3() {
        int[] arr = {3, 7, 8, 5};
        int l = findHighestSum.findHighestSum(arr, 2);

        Assert.assertEquals(15, l);
    }
}