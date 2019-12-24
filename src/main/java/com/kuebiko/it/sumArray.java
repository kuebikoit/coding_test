package CubicTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumArray {
    public Integer sum(List<Integer> numbers)
    {

        int num = 0;
        for(int i = 0;i<numbers.size();i++){
            num += numbers.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        sumArray sa = new sumArray();
        List<Integer> input= Arrays.asList(3,4,4,4);
        System.out.println(sa.sum(input));

    }
}
