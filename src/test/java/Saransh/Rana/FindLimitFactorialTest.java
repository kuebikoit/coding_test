package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLimitFactorialTest {

    @Test
    public void findLimitFactorial() {

        FindLimitFactorial inst = new FindLimitFactorial();

        int num = 7;
        int limit = 2;

        long actual = inst.findLimitFactorial(num, limit);

        Assert.assertEquals("factorial",42 , actual);
    }

    @Test
    public void findLimitFactorial1() {

        FindLimitFactorial inst = new FindLimitFactorial();

        int num = 11;
        int limit = 3;

        long actual = inst.findLimitFactorial(num, limit);

        Assert.assertEquals("factorial",990 , actual);
    }
}