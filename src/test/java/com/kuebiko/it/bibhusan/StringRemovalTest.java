package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class StringRemovalTest {
    private StringRemoval sr= new StringRemoval();
    @Test
    public void removeTest1() {
        //Given s1(String)
        String s1= "HelloWorld";

        //Given s2(String)
        String s2= "World";

        //When(Act)
        String actual = sr.remove(s1,s2);

        //Then(Assert)
        String expected = "Hello";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest2() {
        //Given s1(String)
        String s1= "JustDoIt";

        //Given s2(String)
        String s2= "do";

        //When(Act)
        String actual = sr.remove(s1,s2);

        //Then(Assert)
        String expected = "JustIt";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest3() {
        //Given s1(String)
        String s1= "DoesntContain";

        //Given s2(String)
        String s2= "this";

        //When(Act)
        String actual = sr.remove(s1,s2);

        //Then(Assert)
        String expected = "N/A";
        Assert.assertEquals(expected,actual);
    }
}