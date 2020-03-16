package SafalKoirala.second;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FindSmallestNumbersBetweenIndexesTest {

  @Test
  public void testSmallestNumberInBetween() {
    FindSmallestNumbersBetweenIndexes fsn= new FindSmallestNumbersBetweenIndexes();
    int[] arr={1,8,9,5,7,8,6,2,44,0,1,8,9};
    int[] num={5,8};
    int output=fsn.smallestNumberInBetween(arr,num);
    Assert.assertEquals(2,output);
  }
}