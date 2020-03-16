package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class FindSmallestNumbersBetweenIndexesTest  {


    @Test
    void a() {
        FindSmallestNumbersBetweenIndexes inst = new FindSmallestNumbersBetweenIndexes();
        int []arr=[1, 2, 4, 3, 7, 5];
        int []indexes=[2,4];
        int answer= inst.smallestNumberInBetween(arr,indexes);
        Assert.assertEquals(3,answer);

    }

    @Test
    void b() {
        FindSmallestNumbersBetweenIndexes inst = new FindSmallestNumbersBetweenIndexes();
        int []arr=[7, 9, 10, 17, 2, 4];
        int []indexes=[3, 5];
        int answer= inst.smallestNumberInBetween(arr,indexes);
        Assert.assertEquals(2,answer);

    }

    @Test
    void c() {
        FindSmallestNumbersBetweenIndexes inst = new FindSmallestNumbersBetweenIndexes();
        int []arr=[1, 2, 3, 0];
        int []indexes=[0,3];
        int answer= inst.smallestNumberInBetween(arr,indexes);
        Assert.assertEquals(1,answer);

    }

}
