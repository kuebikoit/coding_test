package CubicTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class largestNumberTest {
@Test
   public void largeTest() {
              largestNumber r = new largestNumber();
       int[] array = {1, 2, 6, 7, 17, 9};
       int value = r.max(array);
       int value2 = 17;
       assertEquals(value, value2);
   }
}