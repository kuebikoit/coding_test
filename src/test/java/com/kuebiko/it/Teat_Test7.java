package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class Teat_Test7 {

    @Test
    public void testing7(){
        Task7 task7 = new Task7();
        int [] input = {3,-2,14,11,14,5,11,7};
        Integer output = task7.max(input);
        Assert.assertTrue(output.equals(14));

        int [] input2 = {-1,-2,0,-9,-4,-5,-11,-7};
        Integer output2 = task7.max(input2);
        Assert.assertTrue(output2.equals(0));

        int [] input3 = {};
        Integer output3 = task7.max(input3);
        Assert.assertTrue(output3.equals(0));
    }
}
