package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLimitFactorialTest {

    @Test
    public void findLimitFactorial1() {
        int num =7;
        int limit=2;
        FindLimitFactorial findlimit= new FindLimitFactorial();
        long result= findlimit.findLimitFactorial(num,limit);
        Assert.assertEquals(42,result);
    }

    @Test
    public void findLimitFactorial2() {
        int num =11;
        int limit=3;
        FindLimitFactorial findlimit= new FindLimitFactorial();
        long result= findlimit.findLimitFactorial(num,limit);
        Assert.assertEquals(990,result);
    }

    @Test
    public void findLimitFactorial3() {
        int num =4;
        int limit=1;
        FindLimitFactorial findlimit= new FindLimitFactorial();
        long result= findlimit.findLimitFactorial(num,limit);
        Assert.assertEquals(4,result);
    }

    @Test
    public void findLimitFactorial4() {
        int num =9;
        int limit=5;
        FindLimitFactorial findlimit= new FindLimitFactorial();
        long result= findlimit.findLimitFactorial(num,limit);
        Assert.assertEquals(15120,result);
    }

    @Test
    public void findLimitFactorial5() {
        int num =21;
        int limit=4;
        FindLimitFactorial findlimit= new FindLimitFactorial();
        long result= findlimit.findLimitFactorial(num,limit);
        Assert.assertEquals(143640,result);
    }

}