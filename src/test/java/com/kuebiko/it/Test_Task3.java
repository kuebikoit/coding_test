package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class Test_Task3 {

    @Test(expected = CustomException.class)
    public void test3(){
        Task3 test3 = new Task3();
try {

    String result = test3.printFizzBuzz(9);
    String result2 = test3.printFizzBuzz(50);
    String result3 = test3.printFizzBuzz(30);
    String result4 = test3.printFizzBuzz(7);
    String result5 = test3.printFizzBuzz(0);


    Assert.assertTrue(result.equals("Fizz"));
    Assert.assertTrue(result2.equals("Buzz"));
    Assert.assertTrue(result3.equals("FizzBizz"));
    Assert.assertTrue(result4.equals("7"));
}catch (CustomException e) {
    e.printStackTrace();
}
    }
}
