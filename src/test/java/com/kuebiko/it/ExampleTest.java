package com.kuebiko.it;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    private Example systemUnderTest = new Example();

    @Test
    public void test_sort() {
        //Given(Arrange)
        int[] input = {3, 4, 5, 1, 2, 6};

        //When(Act)
        int[] actual = systemUnderTest.sort(input);

        //Then(Assert)
        int[] expected = {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sortNegativeNumbers() {
        //Given(Arrange)
        int[] input = {-3, 4, -5, 1, 2, -6};

        //When(Act)
        int[] actual = systemUnderTest.sort(input);

        //Then(Assert)
        int[] expected = {-6, -5, -3, 1, 2, 4};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sortEqualNumbers() {
        //Given(Arrange)
        int[] input = {3, 4, 6, 5, 1, 2, 5, 7, 6};

        //When(Act)
        int[] actual = systemUnderTest.sort(input);

        //Then(Assert)
        int[] expected = {1, 2, 3, 4, 5, 5, 6, 6, 7};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_inputIsNotChanged() {
        //Given(Arrange)
        int[] input = {5, 3, 4, 1, 2};

        //When(Act)
        systemUnderTest.sort(input);

        //Then(Assert)
        int[] expected = {5, 3, 4, 1, 2};
        Assert.assertArrayEquals(expected, input);
    }
}