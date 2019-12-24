package com.kuebiko.it;

import java.util.*;
import java.util.stream.Stream;

public class Task4 {

    public String[] findDuplicate(String[] arr){
      HashSet<String> hashSet = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hashSet.add(arr[i])){
                list.add(arr[i]);
            }
        }
        String [] out = new String[list.size()];
        out = list.toArray(out);
        /*for (int i = 0; i < out.length; i++) {
            out[i]= list.get(i);
        }*/
        return out;
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        String[] input = {"one","two","four","four","one"};
        String[] result = task4.findDuplicate(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        System.out.print("->");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
