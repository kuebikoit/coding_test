package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHighestSumTest {

    @Test
    public void findHighestSumtester() {
        FindHighestSum high = new FindHighestSum();
        int [] arr = {10, 8, 4, 7,6};
        int num = 3;
        int actual = high.findHighestSum(arr, num);
        Assert.assertEquals(25, actual);
    }

    @Test
    public void findHighestSumtester2() {
        FindHighestSum high = new FindHighestSum();
        int [] arr = {1, 8, 4, 7,6};
        int num = 1;
        int actual = high.findHighestSum(arr, num);
        Assert.assertEquals(8, actual);
    }
}