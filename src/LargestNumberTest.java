import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {
    @Test
    public void max() {
        LargestNumber large = new LargestNumber();
        int [] array = {5,6,9,7};
        int largeNum = large.max(array);
        assertEquals(9,largeNum);
    }
}