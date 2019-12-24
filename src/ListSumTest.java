import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListSumTest {


    @org.junit.Test
    public void sumOfList() {
    ListSum ls= new ListSum();
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int sum = ls.sum(list);
        assertEquals(6,sum);
    }
}