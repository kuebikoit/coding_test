package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMatchingPairTest {

    @Test
    public void totalMatchingPair() {

        FindMatchingPair inst = new FindMatchingPair();

        int [] arr = {10,20,10};

        int acutal = inst.totalMatchingPair(arr);

        Assert.assertEquals("Total Matching Pair",
                1, acutal);

    }

    @Test
    public void totalMatchingPair1() {

        FindMatchingPair inst = new FindMatchingPair();

        int [] arr = {1,2,3};

        int acutal = inst.totalMatchingPair(arr);

        Assert.assertEquals("Total Matching Pair",
                0, acutal);

    }
}