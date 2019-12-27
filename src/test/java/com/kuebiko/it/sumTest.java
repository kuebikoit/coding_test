package com.kuebiko.it;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class sumTest {

    @Test
    public void getSum() {
        int expected=7;
        List<Integer> numbers =new ArrayList<> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        int actual=sum.getSum (numbers);
        assertEquals (expected,actual);


    }
}