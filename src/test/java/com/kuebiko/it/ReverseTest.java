package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void reverseString() {
        String expected= "jarawaN";
        String input="Nawaraj";
        String result=Reverse.reverseString (input);
        assertEquals (expected,result);
    }
}