package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.StringRemoval;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Created_On- 15/March/2020
 * @Project- coding_test
 * @Author- Ashrit Koirala
 **/
public class StringRemovalTest {

    @Test
    public void remove() {
        StringRemoval stringRemoval = new StringRemoval();
        String s = stringRemoval.remove("HelloWorld", "World");
        Assert.assertEquals("Hello", s);
    }

    @Test
    public void remove1() {
        StringRemoval stringRemoval = new StringRemoval();
        String s = stringRemoval.remove("JustDoIt", "Do");
        Assert.assertEquals("JustIt", s);
    }

    @Test
    public void remove2() {
        StringRemoval stringRemoval = new StringRemoval();
        String s = stringRemoval.remove("DoesntContain", "this");
        Assert.assertEquals("N/A", s);
    }
}