import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial() {
        Factorial factorial = new Factorial();
        int num = factorial.factorial(5);
        assertEquals(120,120);
    }
}