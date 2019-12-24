package CubicTest;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DupElementsTest {
    @Test
    public void DupTest()
    {
        DupElements r = new DupElements();
       ArrayList<String> input = new ArrayList<String>(Arrays.asList("one","two","four","four","one"));
       ArrayList<String> result = r.DuplicateElements(input);
       ArrayList<String> checkValue = new ArrayList<String>(Arrays.asList("one","four"));
    assertEquals(result,checkValue);
    }

}