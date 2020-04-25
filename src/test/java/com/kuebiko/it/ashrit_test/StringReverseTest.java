package com.kuebiko.it.ashrit_test;

import com.kuebiko.it.ashrit.StringReverse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Created_On- 15/March/2020
 * @Project- coding_test
 * @Author- Ashrit Koirala
 **/
public class StringReverseTest {
    StringReverse stringReverse = new StringReverse();

    @Test
    public void reverse() {
        String str = stringReverse.reverse("Ashrit");

        Assert.assertEquals("tirhsA", str);
    }

    @Test
    public void reverse1() {
        String str = stringReverse.reverse("kushaldai");

        Assert.assertEquals("iadlahsuk", str);
    }
}