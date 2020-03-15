package com.kuebiko.it.Sajan;

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
    int temp;
    for(int i = 0; i<arr.length-1; i++){
      for(int j = i+1; j<arr.length;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    int total =0;
    for (int i =0;i<num;i++){
      total += arr[i];
    }
    return total;
  }
}
