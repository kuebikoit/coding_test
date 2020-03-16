package suvam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRemovalTest {
    String strOne = "HelloWorld";
    String strTwo = "World";

    StringRemoval stringRemovalObj = new StringRemoval();


    @Test
    void inquiry() {
        assertEquals("Hello", stringRemovalObj.remove(strOne,strTwo));
    }
}