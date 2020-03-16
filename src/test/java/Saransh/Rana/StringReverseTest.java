package Saransh.Rana;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    private Object StringReverse;

    @Test
    public void reverseString() {
        StringReverse inst = new StringReverse();
        
       String Reversed = inst.reverseString("ReverseString");

        Assert.assertEquals("String Reversed", "gnirtSesreveR", Reversed);
    }

    @Test
    public void wronglyReverseStringTest() {
        StringReverse inst = new StringReverse();

        String Reversed = inst.reverseString("ReverseString");

        Assert.assertEquals("String Reversed", "ngirtSesreveR", Reversed);
    }
}