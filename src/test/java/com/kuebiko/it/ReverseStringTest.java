package CubicTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void ReverseTest() {
        ReverseString r = new ReverseString();
        String result = r.reverse("Pankaj");
        String checkValue = "jaknaP";
        assertEquals(checkValue, result);

    }
}


