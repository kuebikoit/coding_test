package SafalKoirala.second;

import org.junit.Assert;
import org.junit.Test;

public class FindHighestSumTest {

  @Test
  public void testFindHighestSum() {
    FindHighestSum fhs=new FindHighestSum();
    int[] arr={5,2,3,4,1};
    int output=fhs.findHighestSum(arr,3);
    Assert.assertEquals(12,output);
  }

  @Test
  public void testFindHighestSum1() {
    FindHighestSum fhs=new FindHighestSum();
    int[] arr={1, 11, 111};
    int output=fhs.findHighestSum(arr,1);
    Assert.assertEquals(111,output);
  }
}