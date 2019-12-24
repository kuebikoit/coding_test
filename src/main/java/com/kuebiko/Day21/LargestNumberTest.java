package Day21;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {

    @org.junit.Test
    public void main() {
    }

    @org.junit.Test
    public void largestNum() {
        //Assert.assertTrue(14);
        LargestNumber largestNumber= new LargestNumber();
        int [] arry={1,2,3,4,5};
        int expected=5;
        int actual=largestNumber.largestNum(arry);
        Assert.assertEquals(expected,actual);



    }

    @Test
    public void testLargestNum() {
    }
}