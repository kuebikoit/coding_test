package suvam;

/**
 * Given array of positive integers find total number of matching pairs.
 * eg. [1,2,3,4,5,1,2,3,1,2,3,4,5] => 5
 * [10, 20, 10] => 1
 * [5, 5, 5] => 1
 * [3, 2, 3, 3, 2] => 2
 * [1, 2, 3] => 0
 */
public class FindMatchingPair {
   int pair=0;

  public int totalMatchingPair(int[] arr) {
    for (int i=0; i < arr.length-1; i++){
      for (int j =i+1; j < arr.length; j++){
        if (arr[i] == arr[j]){
          pair++;
        }
      }
    }
    return pair/2;
  }


}














