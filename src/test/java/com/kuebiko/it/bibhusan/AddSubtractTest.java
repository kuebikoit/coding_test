package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddSubtractTest {
    private AddSubtract addSub = new AddSubtract();

    @Test
    public void addSubtractTest1() {

        //Given(Array)
        int[] input ={ 5, 4, 2, 1, 3};

        //Given str(String)
        String str= "ASA";

        //When(Act)
        int actual = addSub.addSubtract(input,str);

        //Then(Assert)
        int expected = 8;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addSubtractTest2() {

        //Given(Array)
        int[] input ={ 11, 1, 3, 15, 21};

        //Given str(String)
        String str= "AA";

        //When(Act)
        int actual = addSub.addSubtract(input,str);

        //Then(Assert)
        int expected = 15;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addSubtractTest3() {

        //Given(Array)
        int[] input ={10, 12, 113, 2, 15};

        //Given str(String)
        String str= "AASA";

        //When(Act)
        int actual = addSub.addSubtract(input,str);

        //Then(Assert)
        int expected = 148;
        Assert.assertEquals(expected,actual);
    }
}