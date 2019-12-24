import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial() {
        Factorial fc= new Factorial();
       int num= fc.factorial(9);
        Assert.assertEquals(num, 362880);

    }
}