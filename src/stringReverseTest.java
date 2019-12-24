import org.junit.Test;

import static org.junit.Assert.*;

public class stringReverseTest {

    @Test
    public void reverse() {

        stringReverse rev= new stringReverse();
        String reverseInput = rev.reverse("This is Java class");
        assertTrue("ssalc avaJ si sihT", true);
    }
}