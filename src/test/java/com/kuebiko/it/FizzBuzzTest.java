package CubicTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        FizzBuzz r = new FizzBuzz();
        String value = r.fizzBuzz(64);
        String expectedVal = "FizzBuzz";
        String expectedVa2 = "Buzz";
        String expectedVa3 = "Fizz";
        assertEquals(Integer.toString(64),value);
    }
}
