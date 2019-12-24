package CubicTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringUsingForLoopTest {

    @Test
    public void reverse() {
        ReverseStringUsingForLoop reverse = new ReverseStringUsingForLoop();
        String expected = "hsednas";
        String output = reverse.reverse("sandesh");
        Assert.assertEquals(expected,output );
    }
}