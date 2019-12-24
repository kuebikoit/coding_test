import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddListTest {


    @org.junit.Test
    public void sum() {
        AddList add = new AddList();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(4);
        int sum = add.sum(list);
        Assert.assertEquals(8,sum);

    }
}

