import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRemovalTest {
    StringRemoval sr = new StringRemoval();

    @Test
    void removeTest1() {

    String newS = sr.remove("JustDoIt","Do");

        Assert.assertEquals("JustIt",newS);
    }
    @Test
    void removeTest2() {

        String newS = sr.remove("JustDoIt","Do");

        Assert.assertNotEquals("BMB",newS);
    }
}