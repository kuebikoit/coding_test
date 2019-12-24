package CubicTest;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        largestNumber r = new largestNumber();
        System.out.println("Please enter your total number of elements of array: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        System.out.println("Please enter your array: ");
       int[] array = new int[input];
        for( int i =0; i <input;i++){
            array[i]= s.nextInt();
        }
        int max= r.max(array);
        System.out.println(max);
    }
       public Integer max(int[]array){
                int Max;
           Max = array[0];
        for(int i=1;i<array.length;i++){
                      if (array[i]> Max) {
                Max= array[i];
            }
        }
    return Max;}



}
