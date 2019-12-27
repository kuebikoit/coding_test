package com.kuebiko.it;

import java.util.ArrayList;

public class duplicates {
public static ArrayList<String> duplicate (String[]arr){
    ArrayList<String> duplicates = new ArrayList<>();

    for(int i=0;i<arr.length;i++){
        for (int j = i+1; j < arr.length; j++)
        {
            if(arr[i]==arr[j]){
                if (!duplicates.contains (arr[j]))
                {
                    duplicates.add(arr[j]);
                }
                break;
            }
        }
    }
  return duplicates;

}
    public static void main(String[] args) {



        String[] arr= {"one","two","four","four","one","four"};
       ArrayList<String> res= duplicate(arr);
        System.out.println ("desired output==="+res);

    }
}
