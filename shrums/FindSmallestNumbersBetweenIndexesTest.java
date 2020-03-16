import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestNumbersBetweenIndexesTest {
    FindSmallestNumbersBetweenIndexes find= new FindSmallestNumbersBetweenIndexes();

    @Test
    void smallestNumberInBetweenTest1() {
    /*Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int[] a= new int[5];
        System.out.println("Enter your range: ");
        int[] b= new int[2];*/

        int small = find.smallestNumberInBetween(new int[]{1, 2, 3, 0},new int[]{0, 3});

    Assert.assertEquals(0,small);
    }
    @Test
    void smallestNumberInBetweenTest2() {
    /*Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int[] a= new int[5];
        System.out.println("Enter your range: ");
        int[] b= new int[2];*/

        int small = find.smallestNumberInBetween(new int[]{1, 2, 3, 0},new int[]{0, 3});

        Assert.assertNotEquals(10,small);
    }
}