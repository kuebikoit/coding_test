package CubicTest;

import java.util.Arrays;

public class LargestNumber {
    public int max (int [] arr){
       int max =0;
       for(int i = 0; i<arr.length;i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }return max;
    }

    public static void main(String[] args) {
        LargestNumber ln =new LargestNumber();
        int[] input= {5,6,9,7};
        System.out.println(Arrays.toString(input)+" ->"+  ln.max(input) );

    }
}
