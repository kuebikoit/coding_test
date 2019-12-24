package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class Test_Task6 {
    @Test
    public void testing6() {
        Task6 task6 = new Task6();
        try {



            Integer result = task6.factorial(4);
            Integer result2 = task6.factorial(0);

            Assert.assertTrue(result.equals(24));
            Assert.assertTrue(result2.equals(1));
          //  Assert.assertTrue(result3.equals(null));
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    @Test(expected =CustomException.class)
    public void testing6_1() {
        Task6 task6 = new Task6();
        try {
            Integer result2 = task6.factorial(0);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}
