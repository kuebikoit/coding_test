package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

public class CountVowelConsonantTest {
    @Test
    public void countVowelConsonanttester() {
        String tester = "SajanDangol";
        CountVowelConsonant check = new CountVowelConsonant();
        int [] expected = {4,7};
        int [] actual = check.countVowelConsonant(tester);
        Assert.assertArrayEquals(expected, actual);


    }
    @Test
    public void countVowelConsonanttester2() {
        String tester = "CoronaVirus";
        CountVowelConsonant check = new CountVowelConsonant();
        int [] expected = {5,6};
        int [] actual = check.countVowelConsonant(tester);
        Assert.assertArrayEquals(expected, actual);


    }
}
