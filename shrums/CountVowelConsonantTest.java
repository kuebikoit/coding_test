import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelConsonantTest {
    CountVowelConsonant cvc = new CountVowelConsonant() ;
    @Test
    void countVowelConsonantTest1() {
        int [] num = cvc.countVowelConsonant("HelloWorld");

        Assert.assertArrayEquals(new int[]{3,7},num);
    }
    @Test
    void countVowelConsonantTest2() {
        int [] num = cvc.countVowelConsonant("HelloWorld");

        Assert.assertNotEquals("not expected",num);
    }
}