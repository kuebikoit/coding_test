package exercise;

import java.util.Arrays;

public class Max {
    public int max(int[] arr) {
       int maximum = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];

            }
        }return maximum;


    }

    public static void main(String[] args) {
        Max w= new Max();
        int n[] ={1,2,3,4,5,6,7,9};
        System.out.println(w.max(n));

    }

}