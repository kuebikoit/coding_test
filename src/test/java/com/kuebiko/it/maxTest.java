package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class maxTest {

    @Test
    public void max() {
        int expected=9;
        int[] actual = {1,2,3,4,5,6,7,8,9};
        int result= Max.max(actual);
        assertEquals (expected,result);
        System.out.println ("the test is pass");
    }
}