package com.kuebiko.it.ashrit;

import javax.swing.text.Utilities;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given array of positive integers find total number of matching pairs.
 * eg. [1,2,3,4,5,1,2,3,1,2,3,4,5] => 5
 * [10, 20, 10] => 1
 * [5, 5, 5] => 1
 * [3, 2, 3, 3, 2] => 2
 * [1, 2, 3] => 0
 */
public class FindMatchingPair {

    public int totalMatchingPair(int[] arr) {
        int countElement = 0, countPair = 0;
        int arr2[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        //  Arrays.sort(arr);
        for (int i = 0; i < arr2.length; i++) {
            countElement = 0;
            for (int j = i; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    countElement++;
                    if (j == arr2.length - 1)
                        i = j;
                } else {
                    i = j - 1;
                    break;
                }
            }
            countPair += countElement / 2;
        }
        return countPair;
    }

}
