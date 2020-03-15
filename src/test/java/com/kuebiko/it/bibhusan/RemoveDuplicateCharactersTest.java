package com.kuebiko.it.bibhusan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateCharactersTest {
    private RemoveDuplicateCharacters rdc= new RemoveDuplicateCharacters();

    @Test
    public void removeTest1() {
        //Given str(String)
        String str= "abbcccA";

        //When(Act)
        String actual = rdc.remove(str);

        //Then(Assert)
        String expected = "abc";
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeTest2() {
        //Given str(String)
        String str= "HeLloOo";

        //When(Act)
        String actual = rdc.remove(str);

        //Then(Assert)
        String expected = "HeLo";
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeTest3() {
        //Given str(String)
        String str= "Batmaan";

        //When(Act)
        String actual = rdc.remove(str);

        //Then(Assert)
        String expected = "Batmn";
        Assert.assertEquals(expected,actual);

    }
}