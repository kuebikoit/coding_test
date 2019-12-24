import java.util.Scanner;

public class LargestNumber {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Numbers of element in the array:");
        int num = scanner.nextInt();

        int [] array= new int[num];
        for (int i=0;i<array.length;i++){
            array[i]= scanner.nextInt();
        }

        LargestNumber largestNumber= new LargestNumber();
        System.out.println(largestNumber.max(array));

    }
    public int max(int [] arr){
        int max= arr[0];
        for (int i=1;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
