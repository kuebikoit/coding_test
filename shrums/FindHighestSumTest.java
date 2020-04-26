import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindHighestSumTest {
    FindHighestSum fhs = new FindHighestSum();
    @Test
    void findHighestSumTest1() {
        int result= fhs.findHighestSum(new int[]{5,2,3,4,1},3);

        Assert.assertEquals(12,result);
    }
    @Test
    void findHighestSumTest2() {
        int result= fhs.findHighestSum(new int[]{5,2,3,4,1},3);

        Assert.assertNotEquals(120 ,result);
    }
}