package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.FindSmallestNumbersBetweenIndexes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestNumbersBetweenIndexesTest {

    @Test
    public void smallestNumberInBetween() {
        int num;
        int[] x = {1, 2, 4, 3, 7, 5};
        int[] y = {2, 4};
        FindSmallestNumbersBetweenIndexes f = new FindSmallestNumbersBetweenIndexes();
        num = f.smallestNumberInBetween(x, y);
        Assert.assertEquals(3, num);
    }

    @Test
    public void smallestNumberInBetween1() {
        int num;
        int[] x = {1, 3, 4, 3, 2, 5};
        int[] y = {0, 2};
        FindSmallestNumbersBetweenIndexes f = new FindSmallestNumbersBetweenIndexes();
        num = f.smallestNumberInBetween(x, y);
        Assert.assertEquals(1, num);
    }

    @Test
    public void smallestNumberInBetween2() {
        int num;
        int[] x = {7, 9, 10, 17, 2, 4};
        int[] y = {3, 5};
        FindSmallestNumbersBetweenIndexes f = new FindSmallestNumbersBetweenIndexes();
        num = f.smallestNumberInBetween(x, y);
        Assert.assertEquals(2, num);
    }
}