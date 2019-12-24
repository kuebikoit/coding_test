package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Test_Task5 {

    @Test
    public void testing5(){
        Task5 task5 = new Task5();
        String output = task5.swapAndPrint(2,3);
        Assert.assertTrue(output.equals("a=3,b=2"));
    }
}
