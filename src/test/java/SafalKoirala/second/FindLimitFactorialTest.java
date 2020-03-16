package SafalKoirala.second;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FindLimitFactorialTest {

  @Test
  public void testFindLimitFactorial() {
    FindLimitFactorial flf=new FindLimitFactorial();
    long output=flf.findLimitFactorial(7,2);
    Assert.assertEquals(42,output);
  }

  @Test
  public void testFindLimitFactorial1() {
    FindLimitFactorial flf=new FindLimitFactorial();
    long output=flf.findLimitFactorial(21,4);
    Assert.assertEquals(143640,output);
  }
}