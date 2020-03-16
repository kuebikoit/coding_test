package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRemovalTest {

    @Test
    public void remove() {
        StringRemoval sr= new StringRemoval();
        String str1 = "HelloWORLD";
        String str2 = "world";
        String result = sr.remove(str1,str2);
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void remove1() {
        StringRemoval sr= new StringRemoval();
        String str1 = "JustDoIt";
        String str2 = "do";
        String result = sr.remove(str1,str2);
        Assert.assertEquals("JustIt", result);
    }

    @Test
    public void remove2() {
        StringRemoval sr= new StringRemoval();
        String str1 = "DoesntContain";
        String str2 = "this";
        String result = sr.remove(str1,str2);
        Assert.assertEquals("N/A", result);
    }
}