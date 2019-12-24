package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test_Task1 {
    @Test
    public void testing(){
        List<Integer> input = Arrays.asList(1,2,4);
        Task1 task1 = new Task1();
        int result = task1.sum(input);
        Assert.assertTrue(result==7);

        List<Integer> input2 = Arrays.asList();
        int result2 = task1.sum(input2);
        Assert.assertTrue(result2==0);

        List<Integer> input3 = Arrays.asList(-1,-2,-3,0);
        int result3 = task1.sum(input3);
        Assert.assertTrue(result3==-6);


    }
}
