package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class FindLimitFactorialTest  {


    @Test
    void a() {
        FindLimitFactorial inst= new FindLimitFactorial();
        int result=inst.findLimitFactorial(7,2);
        Assert.assertEquals(42,result);

    }

    @Test
    void b() {
        FindLimitFactorial inst= new FindLimitFactorial();
        int result=inst.findLimitFactorial(11,3);
        Assert.assertEquals(90,result);

    }


    @Test
    void c() {
        FindLimitFactorial inst= new FindLimitFactorial();
        int result=inst.findLimitFactorial(4,1);
        Assert.assertEquals(4,result);

    }


    @Test
    void d() {
        FindLimitFactorial inst= new FindLimitFactorial();
        int result=inst.findLimitFactorial(9,5);
        Assert.assertEquals(15000,result);

    }



}
