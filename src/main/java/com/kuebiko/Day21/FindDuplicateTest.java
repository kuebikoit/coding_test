package Day21;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicateTest {

    @Test
    public void findDuplicate() {
        String[]words={"one"," two","four","four","one"};
        FindDuplicate obj1= new FindDuplicate();
        String[]obj2= obj1.findDuplicate(words).toArray(new String[0]);
        String[]word={"one","four"};
        Assert.assertArrayEquals(obj2, word);

    }
}