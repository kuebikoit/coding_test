package com.kuebiko.it.bidur;

/**
 * Given array of positive integers "arr" and a number "num"
 * find highest sum from the "arr" by using the total number of elements = "num"
 *
 * eg. arr = [5,2,3,4,1], num = 3 => 12 (5+3+4)
 * arr = [1, 11, 111], num = 1 => 111 (1)
 * arr = [3, 7, 2, 5], num = 2 => 12 (7 + 5)
 */
public class FindHighestSum {
  int sum=0;
  int max=0;
  int index=0;

  public static void main(String[] args) {
    int[] arr= {5,6,3,5,1,9,4};
    int sum= findHighestSum(arr,5);
  }
  public static int findHighestSum(int[] arr, int num) {
    int[] sorted_array= sort(arr);
    System.out.println(sorted_array);
    return 5;
  }

  public static int[] sort(int[] arr){
    int left=0;
    int right= arr.length-1;
    int pivot= arr[right/2];
    while(left<=right){
      while(arr[left]<pivot){
        left++;
      }
      while(arr[right]>pivot)
      {
        right--;
      }
      if(left<=right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
      }
      if(0<right){
        sort(arr);
      }
      if(left<arr.length-1)
      {
        sort(arr);
      }
    }
    return arr;
  }
}
