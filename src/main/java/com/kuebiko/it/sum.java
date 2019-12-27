package com.kuebiko.it;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sum {


    public static void main(String[] args) {


        List<Integer> numbers =new ArrayList<> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        System.out.println ("list" +numbers);
        int result = getSum (numbers);
        System.out.println ("final result::"+result);

    }

    public static int getSum(List<Integer> numbers) {
        int result=0;
        for(int i=0;i<numbers.size ();i++){
            result += numbers.get(i);
        }
        return result;
    }
}
