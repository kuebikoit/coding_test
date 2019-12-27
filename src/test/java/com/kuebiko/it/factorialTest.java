package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class factorialTest {

    @Test
    public void testFact() {
        int expected=24;
        int actual = factorial.fact (4);
        assertEquals (expected,actual);


    }
}