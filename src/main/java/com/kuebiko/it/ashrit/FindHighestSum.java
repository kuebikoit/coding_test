package com.kuebiko.it.ashrit;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given array of positive integers "arr" and a number "num"
 * find highest sum from the "arr" by using the total number of elements = "num"
 * <p>
 * eg. arr = [5,2,3,4,1], num = 3 => 12 (5+3+4)
 * arr = [1, 11, 111], num = 1 => 111 (1)
 * arr = [3, 7, 2, 5], num = 2 => 12 (7 + 5)
 */
public class FindHighestSum {

    public int findHighestSum(int[] arr, int num) {
        int i = arr.length;
        int sum = 0;
        Arrays.sort(arr);
        for(int x=1;x<=num; x++){
            sum += arr[i - x];
        }
        return sum;
    }
}
