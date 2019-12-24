import java.util.List;

public class sum {
    public static void main(String args[]){
        int[] array = {1,2,3};
        int sum = 0;
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}



