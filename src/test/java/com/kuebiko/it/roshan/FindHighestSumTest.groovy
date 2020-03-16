package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class FindHighestSumTest  {

    @Test
    void a() {
        FindHighestSum inst = new FindHighestSum();
        int []arr=[1,2,5,3,4];
        int sum = inst.findHighestSum(arr,3);

        Assert.assertEquals(12,sum);

    }

    @Test
    void b() {
        FindHighestSum inst = new FindHighestSum();
        int []arr=[1,2,5,3,4];
        int sum = inst.findHighestSum(arr,3);

        Assert.assertEquals(1,sum);

    }



}
