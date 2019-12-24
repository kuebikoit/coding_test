import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNUmTest {
    LargestNUm duplicateElement= new LargestNUm();
    @Test
    public void max() {

        int arr[]={3,6,32,54,75,67,23};
        int expec=75;
        int actual=duplicateElement.max(arr);
        Assert.assertEquals(expec,actual);
    }
}