import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void printFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz(3);
        assertEquals("Fizz", "Fizz");
    }
    @Test
    public void printFizzBuzz1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz(5);
        assertEquals("Buzz", "Buzz");
    }
    @Test
    public void printFizzBuzz2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz(15);
        assertEquals("FizzBuzz", "FizzBuzz");
    }
}