package SafalKoirala.second;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CountVowelConsonantTest  {

  @Test
  public void testCountVowelConsonant() {
    CountVowelConsonant cc= new CountVowelConsonant();
   int[] output= cc.countVowelConsonant("HelloWorld");
   int[] expected= new int[]{3,7};
    Assert.assertArrayEquals(expected,output);
  }
}