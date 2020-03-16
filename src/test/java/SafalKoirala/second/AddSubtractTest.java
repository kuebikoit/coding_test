package SafalKoirala.second;

import org.junit.Assert;
import org.junit.Test;

public class AddSubtractTest {

  @Test
  public void testAddSubtract() {
    AddSubtract as= new AddSubtract();
    int arr[]={5, 4, 2, 1, 3};
    int output=as.addSubtract(arr, "ASA");
    Assert.assertEquals(8,output);
  }

  @Test
  public void testAddSubtract1 () {
    AddSubtract as= new AddSubtract();
    int arr[]={11, 1, 3, 15, 21};
    int output=as.addSubtract(arr, "AA");
    Assert.assertEquals(15,output);
  }

  @Test
  public void testAddSubtract2 () {
    AddSubtract as= new AddSubtract();
    int arr[]={10, 12, 113, 2, 15};
    int output=as.addSubtract(arr, "AASA");
    Assert.assertEquals(148,output);
  }
}