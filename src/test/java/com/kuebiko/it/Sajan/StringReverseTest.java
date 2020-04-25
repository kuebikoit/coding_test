package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void stringReverser() {
        StringReverse rev = new StringReverse();
        String actual = rev.stringReverser("SajanDangol");
        Assert.assertEquals("lognaDnajaS", actual);
    }


    @Test
    public void stringReverser2() {
        StringReverse rev = new StringReverse();
        String actual = rev.stringReverser("CoronaVirus");
        Assert.assertEquals("suriVanoroC", actual);
    }
}