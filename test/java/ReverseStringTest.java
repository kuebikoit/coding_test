import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse() {
        ReverseString reverseString= new ReverseString();
        String str="Yubaraj16213!#$%^&";
        String expected= reverseString.Reverse(str);
        System.out.println(expected);
        String actual=" &^%$#!31261jarabuY";

        Assert.assertEquals(actual,expected);
    }
}