package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    private StringReverse sr= new StringReverse();
    @Test
    public void reverseTest1() {
        //Given str(String)
        String str= "bravo";

        //When(Act)
        String actual = sr.reverse(str);

        //Then(Assert)
        String expected = "ovarb";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void reverseTest2() {
        //Given str(String)
        String str= "Nepal";

        //When(Act)
        String actual = sr.reverse(str);

        //Then(Assert)
        String expected = "lapeN";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void reverseTest3() {
        //Given str(String)
        String str= "RAR";

        //When(Act)
        String actual = sr.reverse(str);

        //Then(Assert)
        String expected = "RAR";
        Assert.assertEquals(expected,actual);
    }
}