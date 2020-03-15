package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMatchingPairTest {
    private FindMatchingPair fmp= new FindMatchingPair();
    @Test
    public void totalMatchingPairTest1() {

        //Given Array(integer array)
        int[] arr= {1,2,3,4,5,1,2,3,1,2,3,4,5};

        //When(Act)
        int actual = fmp.totalMatchingPair(arr);

        //Then(Assert)
        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void totalMatchingPairTest2() {

        //Given Array(integer array)
        int[] arr= {10, 20, 10};

        //When(Act)
        int actual = fmp.totalMatchingPair(arr);

        //Then(Assert)
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void totalMatchingPairTest3() {

        //Given Array(integer array)
        int[] arr= {1, 2, 3};

        //When(Act)
        int actual = fmp.totalMatchingPair(arr);

        //Then(Assert)
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
}