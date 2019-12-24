import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class duplicateElementsTest {

    @Test
    public void list() {
        duplicateElements duplicateElements = new duplicateElements();
        List<String> list = Arrays.asList("one", "two", "four", "four", "one");
        List<String> list1 = Arrays.asList("one", "four");
        List<String> dup = duplicateElements.list(list);
        assertEquals(dup, list1);
    }
}