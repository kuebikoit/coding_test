package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPerfectSquareTest {

    @Test
    public void getNextPerfectSquare() {
        NextPerfectSquare inst = new NextPerfectSquare();

        int Number = inst.getNextPerfectSquare(16);

        Assert.assertEquals(25, Number);

    }

    @Test
    public void getNextPerfectSquareNegativeTest() {
        NextPerfectSquare inst = new NextPerfectSquare();

        int Number = inst.getNextPerfectSquare(15);

        Assert.assertEquals(-1, Number);

    }
}