package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.CountVowelConsonant;
import org.junit.Assert;
import org.junit.Test;

public class CountVowelConsonantTest {
    CountVowelConsonant countVowelConsonant = new CountVowelConsonant();

    @Test
    public void countVowelConsonant() {
        String s = "HelloWorld";
        int t[] = countVowelConsonant.countVowelConsonant(s);
        int[] a = {3, 7};
        Assert.assertArrayEquals(t, a);
    }

    @Test
    public void countVowelConsonant1() {
        String s = "KuebikoIt";
        int t[] = countVowelConsonant.countVowelConsonant(s);
        int[] a = {5, 4};
        Assert.assertArrayEquals(t, a);
    }
}