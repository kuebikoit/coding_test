package Saransh.Rana;

import java.util.Arrays;

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

    int Match = 0;

    Arrays.sort(arr);
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        if(arr[i] == arr[j]){
           Match++;
        }
      }


    }

    return Match;
  }

}
