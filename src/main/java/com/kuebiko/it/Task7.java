package com.kuebiko.it;

public class Task7 {
    public int max(int[] arr){
        int max = 0;
        for(int j:arr){
            if(max<j){
                max= j;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        int[] input= {5,6,9,7};
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.print("->");
        System.out.println(task7.max(input));
    }
}
