package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestNumbersBetweenIndexesTest {
    private FindSmallestNumbersBetweenIndexes fsnbi= new FindSmallestNumbersBetweenIndexes();//

    @Test
    public void smallestNumberInBetweenTest1() {

        //Given Array(integer array)
        int[] arr= {1, 2, 4, 3, 7, 5};

        //Given Index array(integer)
        int[] indexes= {2,4};

        //When(Act)
        int actual = fsnbi.smallestNumberInBetween(arr,indexes);

        //Then(Assert)
        int expected = 3;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void smallestNumberInBetweenTest2() {

        //Given Array(integer array)
        int[] arr= {7, 9, 10, 17, 2, 4};

        //Given Index array(integer)
        int[] indexes= {3, 5};

        //When(Act)
        int actual = fsnbi.smallestNumberInBetween(arr,indexes);

        //Then(Assert)
        int expected = 2;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void smallestNumberInBetweenTest3() {

        //Given Array(integer array)
        int[] arr= {1, 2, 3, 0};

        //Given Index array(integer)
        int[] indexes= {0, 3};

        //When(Act)
        int actual = fsnbi.smallestNumberInBetween(arr,indexes);

        //Then(Assert)
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
}