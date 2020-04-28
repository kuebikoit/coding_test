import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLimitFactorialTest {
    FindLimitFactorial flf = new FindLimitFactorial();
    @Test
    void findLimitFactorialTest1() {
    long num = flf.findLimitFactorial(7,2);

    Assert.assertEquals(42,num);
    }
    @Test
    void findLimitFactorialTest2() {
        long num = flf.findLimitFactorial(7,2);

        Assert.assertNotEquals(420,num);
    }

}