package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class swapAndprintTest {

    @Test
    public void swapPrint() {
        String expected="5,3";
        int a=3;
        int b=5;
        String actual=swapAndprint.swapPrint (a,b);
        assertEquals (expected,actual);
    }
}