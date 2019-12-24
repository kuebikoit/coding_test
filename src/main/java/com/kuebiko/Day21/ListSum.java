package Day21;

import java.util.Arrays;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,25,30);
        int result=sum(list);
        System.out.println("The sum of the list is "+result);

    }
    public static int sum(List<Integer> numbers){
        int sum=0;
        for(Integer num:numbers){
            sum+=num;
        }
        return sum;
    }

}
