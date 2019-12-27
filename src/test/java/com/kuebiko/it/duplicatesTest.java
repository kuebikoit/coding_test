package com.kuebiko.it;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class duplicatesTest {

    @Test
    public void duplicate() {
        ArrayList<String>expected= new ArrayList<String>(Arrays.asList ("one","four"));
        String [] actual={"one","two","three","one","four","four"};
        ArrayList<String> res=duplicates.duplicate (actual);
        assertEquals (expected,res);
    }
}