import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    StringReverse sr= new StringReverse();

    @Test
    void abaTest1() {
        String s = sr.aba("Bhaskar");

        Assert.assertEquals( "raksahB", s);
    }

    @Test
    void abaTest2() {

        String s = sr.aba("Bhaskar");

        Assert.assertNotEquals( "Bhaskar", s);
    }
}

