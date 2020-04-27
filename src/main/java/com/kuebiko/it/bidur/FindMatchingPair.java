package com.kuebiko.it.bidur;

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
    int no_of_pair=0;
    int temp;
    for (int i=0; i<arr.length; i++)
    {
      temp=arr[i];
      if (temp!= 0) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] == temp)
          {
            no_of_pair++;
            arr[j]=0;
            break;
          }
        }
      }
    }
    return no_of_pair;
  }

}
