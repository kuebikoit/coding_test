package Day21;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListSumTest {

    @Test
    public void sum() {
        List<Integer> list= Arrays.asList(10,25,30);
        ListSum obj=new ListSum();
        int sum=obj.sum(list);
        int sum1=65;
        Assert.assertEquals(sum, sum1);
    }
}