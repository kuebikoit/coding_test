package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.FindMatchingPair;
import org.junit.Assert;
import org.junit.Test;

public class FindMatchingPairTest {
    FindMatchingPair findMatchingPair = new FindMatchingPair();


    @Test
    public void totalMatchingPair() {
        int[] arr = {10, 20, 10, 10};
        int a = findMatchingPair.totalMatchingPair(arr);

        Assert.assertEquals(1, a);
    }

    @Test
    public void totalMatchingPair1() {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 3, 4, 5};
        int a = findMatchingPair.totalMatchingPair(arr);

        Assert.assertEquals(5, a);
    }

    @Test
    public void totalMatchingPair2() {
        int[] arr = {5, 5, 5, 6};
        int a = findMatchingPair.totalMatchingPair(arr);

        Assert.assertEquals(1, a);
    }

    @Test
    public void totalMatchingPair3() {
        int[] arr = {3, 2, 3, 3, 2};
        int a = findMatchingPair.totalMatchingPair(arr);

        Assert.assertEquals(2, a);
    }
}