package CubicTest;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SwapPrintTest {
    @Test
    public void swapping(){
       SwapPrint r = new SwapPrint();
       ArrayList<Integer>result = r.swapAndPrint(8,9);
        ArrayList<Integer>checkResult= new ArrayList<Integer>(Arrays.asList(9,8));
        assertEquals(result,checkResult);
    }

}