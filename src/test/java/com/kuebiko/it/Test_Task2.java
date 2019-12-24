package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test_Task2 {
    @Test(expected = NullPointerException.class)
    public void testing2(){

        Task2 task2 = new Task2();
        String result = task2.reverse("Reverse this!");
        Assert.assertTrue(result.equals("!siht esreveR"));

        String result2 = task2.reverse("");
        Assert.assertTrue(result2.equals(""));

        String result3 = task2.reverse(null);
    }
}
