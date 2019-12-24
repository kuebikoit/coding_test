import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q1 {
    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);


        int sum = sum(numbers);
        System.out.println("sum is:"+sum);
    }
}