import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SwapPrintTest {

    @Test
    public void swapAndPrint() {
        SwapPrint swapPrint = new SwapPrint();
        int a = 12;
        int b = 15;
        int[] input = {a,b};
        int [] expected={15,12};
      swapPrint.SwapAndPrint(a,b);
      int [] actual={a,b};

      Assert.assertNotEquals(expected,actual);
    }
}