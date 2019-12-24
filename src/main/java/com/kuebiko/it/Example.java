package com.kuebiko.it;

public class Example {

    //Sort numbers in ascending order
    public int[] sort(int[] arr) {
        //clone so that no side effects on incoming array
        int[] copy = arr.clone();
        int size = copy.length;

        for (int i = 0; i < size; i++) {
            int element_i = copy[i];
            // compare with every other element
            for (int j = i + 1; j < size; j++) {
                int element_j = copy[j];
                if (element_j < element_i) {
                    copy[i] = element_j;
                    copy[j] = element_i;
                    
                    element_i = element_j;
                }
            }
        }

        return copy;
    }
}
