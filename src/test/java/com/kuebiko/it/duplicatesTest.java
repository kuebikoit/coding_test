package com.kuebiko.it;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class duplicatesTest {

    @Test
    public void duplicate() {
        ArrayList<String>expected= new ArrayList<String>(Arrays.asList ("one","four"));
        String [] actual={"one","two","three","one","four","four"};
        ArrayList<String> res= Duplicates.duplicate (actual);
        assertEquals (expected,res);
    }
}