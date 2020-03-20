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
    StringRemoval stringRemoval = new StringRemoval();

    @Test
    public void remove() {
        String s = stringRemoval.remove("HelloWorld", "World");

        Assert.assertEquals("Hello", s);
    }

    @Test
    public void remove1() {
        String s = stringRemoval.remove("JustDoIt", "do");

        Assert.assertEquals("JustIt", s);
    }

    @Test
    public void remove2() {
        String s = stringRemoval.remove("DoesntContain", "this");

        Assert.assertEquals("N/A", s);
    }
}