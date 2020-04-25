package com.kuebiko.it.Sajan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateCharactersTest {

    @Test
    public void removeTester() {
        RemoveDuplicateCharacters duplicate = new RemoveDuplicateCharacters();
        String Actual = duplicate.remove("SajanDangol");
        Assert.assertEquals("SajnDgol", Actual);
    }

    @Test
    public void removeTester2() {
        RemoveDuplicateCharacters duplicate = new RemoveDuplicateCharacters();
        String Actual = duplicate.remove("OneisthegoalotherisGoat");
        Assert.assertEquals("Oneisthgalr", Actual);
    }
}