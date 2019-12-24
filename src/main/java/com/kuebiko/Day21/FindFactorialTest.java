package Day21;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFactorialTest {

    @Test
    public void findFactorial() {
        FindFactorial obj= new FindFactorial();
        int factorial=120;
        int num=5;
        int expectedVlaue=obj.findFactorial(num);
        Assert.assertEquals(factorial, expectedVlaue);
    }
}