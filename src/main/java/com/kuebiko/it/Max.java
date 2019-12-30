package com.kuebiko.it;

public class Max {
   public static int max(int[] arr){
       int i=0;
       int max = arr[0];
        for( i = 1; i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
       }

       return max;
   }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        max(num);
        System.out.println ("Output==="+max(num));
    }

}
