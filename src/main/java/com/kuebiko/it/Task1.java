package com.kuebiko.it;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public int sum(List<Integer> input) {
        int sum = 0;

        for(Integer i:input){
            sum+=i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<Integer> input = Arrays.asList(1,2,4);
        System.out.println(input+"->"+task1.sum(input));
    }
}
