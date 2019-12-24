import com.cubic.test1.Test1;
import org.junit.*;

import java.util.Arrays;

public class AppTest {

    Test1 app = new Test1();

    @Test
    public void testSum1() {
        int expected = 7;
        int actual = app.sum(Arrays.asList(1, 2, 4));
        Assert.assertEquals(expected, actual);

        expected = 0;
        actual = app.sum(Arrays.asList());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReverse1() {
        Assert.assertEquals("!siht esreveR", app.reverse("Reverse this!"));
        Assert.assertEquals(" s", app.reverse("s "));

    }

    @Test
    public void testPrintFizzBuzz1() {
        Assert.assertEquals("Fizz", app.printFizzBuzz(3));
        Assert.assertEquals("Buzz", app.printFizzBuzz(5));
        Assert.assertEquals("FizzBuzz", app.printFizzBuzz(15));
        Assert.assertEquals("7", app.printFizzBuzz(7));
    }

    @Test
    public void testMax() {
        Assert.assertEquals(9, app.max(new int[]{5, 6, 9, 7}));
        Assert.assertEquals(14, app.max(new int[]{3, -2, 14, 11, 14, 5, 11, 7}));

    }


    @Test
    public void testFactorial() {
        int expected = 24;
        int actual = app.factorial(4);
        Assert.assertEquals(expected, actual);

        expected = 120;
        actual = app.factorial(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapTest() {
        int initialArray[] = {9, 8};
        int expected[] = {8, 9};

        int acutal[] = app.swap(initialArray[0], initialArray[1]);
        Assert.assertArrayEquals(expected, acutal);
    }

    @Test
    public void duplicateTest() {
        String input[] = new String[]{"one","one", "two", "four", "four", "one"};
        String expected[] = new String[]{"one", "four"};
        String actual[] = app.findDuplicate(input);
        Assert.assertArrayEquals(expected, actual);
    }

}
