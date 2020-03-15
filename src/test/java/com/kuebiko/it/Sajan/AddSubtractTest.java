package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;


public class AddSubtractTest {

    @Test
    public void addSubtracttest() {
        int [] arr ={1,2,5,6,7,9};
        String str = "ASA";
        AddSubtract add = new AddSubtract();
        int total = add.addSubtract(arr, str);
        Assert.assertEquals(4, total);
    }
    @Test
    public void addSubtracttest2() {
        int [] arr ={5,2,6,6,8,9};
        String str = "Assaaaaa";
        AddSubtract add = new AddSubtract();
        int total = add.addSubtract(arr, str);
        Assert.assertEquals(12, total);  // total should be 12 but tried to check test that wll fail
    }
}
