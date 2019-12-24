import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
 Example systemUnderTest= new Example();
    @Test
    public void sort() {
    int[] input={4,5,3,2,6,7,8};
    int[] actual=systemUnderTest.sort(input);
    int[] expected={2,3,4,5,6,7,8};
        Assert.assertEquals(expected,actual);
    }
}