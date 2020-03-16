package com.kuebiko.it.bidur;

/**
 * Given two positive number arrays,
 * first contains the number to evaluate which is smallest
 * in between the indexes contained in second array
 * find smallest number
 * eg. [1, 2, 4, 3, 7, 5] and [2, 4] => 3 (numbers evaluated 4, 3, 7)
 * [1, 3, 4, 3, 2, 5] and [0, 2] => 1 (numbers evaluated 1, 3, 4)
 * [7, 9, 10, 17, 2, 4] and [3, 5] => 2 (numbers evaluated 17, 2, 4)
 * [1, 2, 3, 0] and [0, 3] => 0 (numbers evaluated 1, 2, 3, 0)
 */
public class FindSmallestNumbersBetweenIndexes {

  public int smallestNumberInBetween(int[] arr, int[] indexes) {
    int i = 0;
    int smallest_num= arr[indexes[0]];
    for (int j = indexes[0]; j <= indexes[1]; j++) {
      if (arr[j] < smallest_num) {
        smallest_num = arr[j];
      }
    }
    return smallest_num;
  }
}


