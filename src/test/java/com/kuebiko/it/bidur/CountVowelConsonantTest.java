package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelConsonantTest {

    @Test
    public void countVowelConsonant() {
        String str = "HelloWorld";
        int[] result = CountVowelConsonant.countVowelConsonant(str);
        int[] expected={3,7};
        Assert.assertArrayEquals(expected,result);
    }

    @Test
    public void countVowelConsonant1() {
        String str = "KuebikoIt";
        int[] result = CountVowelConsonant.countVowelConsonant(str);
        int[] expected={5,4};
        Assert.assertArrayEquals(expected,result);
    }
}