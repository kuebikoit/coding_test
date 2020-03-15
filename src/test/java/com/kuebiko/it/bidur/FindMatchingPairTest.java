package com.kuebiko.it.bidur;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMatchingPairTest {

    @Test
    public void totalMatchingPair() {
        FindMatchingPair pair= new FindMatchingPair();
        int[] arr= {1,2,3,4,5,1,2,3,1,2,3,4,5};
        int no_of_pair= pair.totalMatchingPair(arr);
        Assert.assertEquals(5,no_of_pair);
    }

    @Test
    public void totalMatchingPair1() {
        FindMatchingPair pair= new FindMatchingPair();
        int[] arr= {10,20,10};
        int no_of_pair= pair.totalMatchingPair(arr);
        Assert.assertEquals(1,no_of_pair);
    }

    @Test
    public void totalMatchingPair2() {
        FindMatchingPair pair= new FindMatchingPair();
        int[] arr= {5,5,5};
        int no_of_pair= pair.totalMatchingPair(arr);
        Assert.assertEquals(1,no_of_pair);
    }

    @Test
    public void totalMatchingPair3() {
        FindMatchingPair pair= new FindMatchingPair();
        int[] arr= {3,2,3,3,3};
        int no_of_pair= pair.totalMatchingPair(arr);
        Assert.assertEquals(2,no_of_pair);
    }

    @Test
    public void totalMatchingPair4() {
        FindMatchingPair pair= new FindMatchingPair();
        int[] arr= {1,2,3};
        int no_of_pair= pair.totalMatchingPair(arr);
        Assert.assertEquals(0,no_of_pair);
    }
}