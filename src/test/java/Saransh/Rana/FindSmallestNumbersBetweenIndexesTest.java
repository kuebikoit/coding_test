package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestNumbersBetweenIndexesTest {

    @Test
    public void smallestNumberInBetween() {

        FindSmallestNumbersBetweenIndexes inst = new FindSmallestNumbersBetweenIndexes();

        int [] arr = {1,2,4,3,7,5};
        int [] indexes = {2,4};

        int actual = inst.smallestNumberInBetween(arr, indexes);

        Assert.assertEquals("Smallest Number", 3, actual);


    }

    @Test
    public void smallestNumberInBetween1() {

        FindSmallestNumbersBetweenIndexes inst = new FindSmallestNumbersBetweenIndexes();

        int [] arr = {1,2,3,0};
        int [] indexes = {0,3};

        int actual = inst.smallestNumberInBetween(arr, indexes);

        Assert.assertEquals("Smallest Number", 1, actual);


    }
}