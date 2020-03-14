package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

public class AddSubtractTest {

    @Test
    public void addSubtract1() {
        AddSubtract addsub= new AddSubtract();
        int[] arr= {5,4,2,1,3};
        String str ="ASA";
        int result= addsub.addSubtract(arr, str);
        Assert.assertEquals(8,result);
    }

    @Test
    public void addSubtract2() {
        AddSubtract addsub= new AddSubtract();
        int[] arr= {11,1,3,15,21};
        String str ="AA";
        int result= addsub.addSubtract(arr, str);
        Assert.assertEquals(15,result);
    }

    @Test
    public void addSubtract3() {
        AddSubtract addsub= new AddSubtract();
        int[] arr= {10,12,113,2,15};
        String str ="AASA";
        int result= addsub.addSubtract(arr, str);
        Assert.assertEquals(148,result);
    }
}