package SafalKoirala.second;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest  {

  @Test
  public void testReverse() {
    StringReverse sr=new StringReverse();
    String output=sr.reverse("Hello");
    Assert.assertEquals("olleH",output);
  }
}