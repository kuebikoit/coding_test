package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHighestSumTest {
    private FindHighestSum fhs= new FindHighestSum();

    @Test
    public void findHighestSumTest1() {
        //Given num(Integer)
        int num= 3;

        //Given arr(Int Array)
        int[] arr= {5,2,3,4,1};

        //When(Act)
        int actual = fhs.findHighestSum(arr,num);

        //Then(Assert)
        int expected = 12;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findHighestSumTest2() {
        //Given num(Integer)
        int num= 1;

        //Given arr(Int Array)
        int[] arr= {1, 11, 111};

        //When(Act)
        int actual = fhs.findHighestSum(arr,num);

        //Then(Assert)
        int expected = 111;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findHighestSumTest3() {
        //Given num(Integer)
        int num= 2;

        //Given arr(Int Array)
        int[] arr= {3, 7, 2, 5};

        //When(Act)
        int actual = fhs.findHighestSum(arr,num);

        //Then(Assert)
        int expected = 12;
        Assert.assertEquals(expected,actual);
    }
}