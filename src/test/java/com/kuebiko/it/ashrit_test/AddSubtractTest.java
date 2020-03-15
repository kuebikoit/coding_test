package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.AddSubtract;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddSubtractTest {

    @Test
    public void addSubtract_test() {

        int arr[]={5, 4, 2, 1, 3};
        String s = "SSS";
        AddSubtract a = new AddSubtract();
        int k=a.addSubtract(arr,s);
        Assert.assertEquals(8,k);
    }

    @Test
    public void addSubtract_test2() {

        int arr[]={11, 1, 3, 15, 21};
        String s = "AA";
        AddSubtract a = new AddSubtract();
        int k=a.addSubtract(arr,s);
        Assert.assertEquals(15,k);
    }
    @Test
    public void addSubtract_test3() {

        int arr[]={10, 12, 113, 2, 15};
        String s = "AASA";
        AddSubtract a = new AddSubtract();
        int k=a.addSubtract(arr,s);
        Assert.assertEquals(148,k);
    }
}