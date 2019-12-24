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
    }
}
