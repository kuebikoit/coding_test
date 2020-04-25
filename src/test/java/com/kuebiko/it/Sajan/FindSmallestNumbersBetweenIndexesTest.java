package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestNumbersBetweenIndexesTest {

    @Test
    public void smallestNumberInBetweenTester() {
        FindSmallestNumbersBetweenIndexes smaller = new FindSmallestNumbersBetweenIndexes();
        int [] arr = {5,7,3,6,8};
        int[] index = {1, 3};
        int actual = smaller.smallestNumberInBetween(arr, index);
        Assert.assertEquals(3, actual);
    }

    @Test
    public void smallestNumberInBetweenTester2() {
        FindSmallestNumbersBetweenIndexes smaller = new FindSmallestNumbersBetweenIndexes();
        int [] arr = {4,7,2,1,5, 6, 9, 10};
        int[] index = {0, 6};
        int actual = smaller.smallestNumberInBetween(arr, index);
        Assert.assertEquals(1, actual);
    }
}