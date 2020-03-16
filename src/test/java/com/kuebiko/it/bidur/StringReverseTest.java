package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void stringReverse() {
        String str = "Baba";
        String result = StringReverse.stringReverse(str);
        Assert.assertEquals("abaB", result);
    }

    @Test
    public void stringReverse1() {
        String str = "Cubic Rubic";
        String result = StringReverse.stringReverse(str);
        Assert.assertEquals("cibuR cibuC", result);
    }
}