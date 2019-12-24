package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class Test_Task4 {
    @Test
    public void testing4(){
    String[] input1 = {"one","two","one","four","four"};
    String[] output1 = {"one","four"};
        Task4 task4 = new Task4();
        String[] result = task4.findDuplicate(input1);

        Assert.assertTrue(result[0].equals(output1[0]));
        Assert.assertTrue(result[1].equals(output1[1]));


        Assert.assertArrayEquals(output1,result);

    }
}
