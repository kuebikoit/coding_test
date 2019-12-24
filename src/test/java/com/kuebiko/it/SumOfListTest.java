package CubicTest;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfListTest {

    @org.junit.Test
    public void sum() {
        SumOfList r = new SumOfList();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4));
        int result = r.sum(list);
        Assert.assertEquals(result,7);
    }
}