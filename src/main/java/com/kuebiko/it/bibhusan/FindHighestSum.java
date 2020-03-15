package com.kuebiko.it.bibhusan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given array of positive integers "arr" and a number "num"
 * find highest sum from the "arr" by using the total number of elements = "num"
 *
 * eg. arr = [5,2,3,4,1], num = 3 => 12 (5+3+4)
 * arr = [1, 11, 111], num = 1 => 111 (1)
 * arr = [3, 7, 2, 5], num = 2 => 12 (7 + 5)
 */
public class FindHighestSum {

  public int findHighestSum(int[] arr, int num) {
    arr = sort(arr); // sorted array
    int sum = 0;
    for (int i = arr.length - 1; i >= (arr.length - num); i--) {
      sum = sum + arr[i];
    }
    return sum;
  }

  private int[] sort(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      int temp;
      for (int i = 0; i < (arr.length - 1) - j; i++) {
        if (!(arr[i] < arr[i + 1])) {
          temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
    return arr;
  }

}
