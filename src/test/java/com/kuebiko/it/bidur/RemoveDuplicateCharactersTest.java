package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateCharactersTest {

    @Test
    public void remove() {
        RemoveDuplicateCharacters rdc= new RemoveDuplicateCharacters();
        String str = "abbccca";
        String result= rdc.remove(str);
        Assert.assertEquals("abc", result);
    }

    @Test
    public void remove1() {
        RemoveDuplicateCharacters rdc= new RemoveDuplicateCharacters();
        String str = "HeLloOo";
        String result= rdc.remove(str);
        Assert.assertEquals("HeLo", result);
    }

    @Test
    public void remove2() {
        RemoveDuplicateCharacters rdc= new RemoveDuplicateCharacters();
        String str = "Batmaan";
        String result= rdc.remove(str);
        Assert.assertEquals("Batmn", result);
    }

    @Test
    public void remove3() {
        RemoveDuplicateCharacters rdc= new RemoveDuplicateCharacters();
        String str = "riverside";
        String result= rdc.remove(str);
        Assert.assertEquals("rivesd", result);
    }
}