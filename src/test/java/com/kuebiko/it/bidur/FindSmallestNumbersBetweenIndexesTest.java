package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestNumbersBetweenIndexesTest {

    @Test
    public void smallestNumberInBetween() {
        int[] arr={1,2,4,3,7,5};
        int[] index={2,4};
        FindSmallestNumbersBetweenIndexes find= new FindSmallestNumbersBetweenIndexes();
        int min= find.smallestNumberInBetween(arr, index);
        Assert.assertEquals(3,min);
    }

    @Test
    public void smallestNumberInBetween1() {
        int[] arr={1,3,4,3,2,5};
        int[] index={0,2};
        FindSmallestNumbersBetweenIndexes find= new FindSmallestNumbersBetweenIndexes();
        int min= find.smallestNumberInBetween(arr, index);
        Assert.assertEquals(1,min);
    }

    @Test
    public void smallestNumberInBetween2() {
        int[] arr={7,9,10,17,2,4};
        int[] index={3,5};
        FindSmallestNumbersBetweenIndexes find= new FindSmallestNumbersBetweenIndexes();
        int min= find.smallestNumberInBetween(arr, index);
        Assert.assertEquals(2,min);
    }

    @Test
    public void smallestNumberInBetween3() {
        int[] arr={1,2,3,0};
        int[] index={0,3};
        FindSmallestNumbersBetweenIndexes find= new FindSmallestNumbersBetweenIndexes();
        int min= find.smallestNumberInBetween(arr, index);
        Assert.assertEquals(0,min);
    }
}