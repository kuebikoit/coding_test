import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DuplicateElementTest {

    @Test
    public void list() {
        DuplicateElement dpe= new DuplicateElement();
        List<String> list = new ArrayList<String>();
        list.add("HIi");
        list.add("Hi");
        list.add("HIe");
        list.add("HIi");

     List <String> str=  dpe.list(list);
     List<String> expected= Arrays.asList("HIi");
        Assert.assertEquals(expected,str);

    }
}