package CubicTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {


    @Test
    public void max() {
        LargestNumber ln = new LargestNumber();
        int [] arr = {1,23,4,5,6,7,7,7,7,7};
        int expected1 = 23;
        int output1 = ln.max(arr);
        Assert.assertEquals(expected1,output1);
    }

    @Test
    public void max2() {
        LargestNumber ln = new LargestNumber();
        int [] arr = {0,0,0,0,0,0};
        int expected1 = 0;
        int output1 = ln.max(arr);
        Assert.assertEquals(expected1,output1);
    }
}