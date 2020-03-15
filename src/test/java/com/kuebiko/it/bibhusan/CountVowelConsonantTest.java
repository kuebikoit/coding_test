package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelConsonantTest {

    private CountVowelConsonant cvs= new CountVowelConsonant();

    @Test
    public void countVowelConsonantTest1() {

        //Given str(String)
        String str= "HelloWorld";

        //When(Act)
        int[] actual = cvs.countVowelConsonant(str);

        //Then(Assert)
        int[] expected = {3,7};
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void countVowelConsonantTest2() {

        //Given str(String)
        String str= "KuebikoIt";

        //When(Act)
        int[] actual = cvs.countVowelConsonant(str);

        //Then(Assert)
        int[] expected = {5,4};
        Assert.assertArrayEquals(expected,actual);

    }
}