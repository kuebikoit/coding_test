import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> sumList= new ArrayList<Integer>();
        ListSum listsum = new ListSum();
        System.out.println(listsum.sum(sumList));
    }
    public  Integer sum(List<Integer> numbers){
        int sum =0;
        for (Integer i: numbers){
            sum += i;
        }
        return sum;
    }
}
