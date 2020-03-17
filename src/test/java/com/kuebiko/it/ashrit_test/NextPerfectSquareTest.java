package com.kuebiko.it.ashrit_test;

import org.junit.Assert;
import org.junit.Test;
import com.kuebiko.it.ashrit.*;

import static org.junit.Assert.*;

/**
 * @Created_On- 15/March/2020
 * @Project- coding_test
 * @Author- Ashrit Koirala
 **/
public class NextPerfectSquareTest {

    @Test
    public void test1() {
        NextPerfectSquare nextPerfectSquare = new NextPerfectSquare();
        int i = nextPerfectSquare.getNextPerfectSquare(16);
        Assert.assertEquals(25, i);
    }

    @Test
    public void test2() {
        NextPerfectSquare nextPerfectSquare = new NextPerfectSquare();
        int i = nextPerfectSquare.getNextPerfectSquare(23);
        Assert.assertEquals(-1, i);
    }

}