package com.kuebiko.it;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public String reverse(String input) {
            String output="";
            for (int i = 0; i < input.length(); i++) {
                output = output.concat(String.valueOf(input.charAt(input.length()-i-1)));}
            System.out.println(output);
            return output;

    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println("Reverse this! -> "+task2.reverse("Reverse this!"));
    }
}

