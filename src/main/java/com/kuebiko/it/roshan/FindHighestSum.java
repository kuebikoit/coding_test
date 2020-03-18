package com.kuebiko.it.roshan;

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

        int size= arr.length;
        int sum=0;
        int container=0;

          for(int i=0;i<size;i++){
              for(int j=0;j<size;j++){

                  if (arr[i]>=arr[j]){
                        container=arr[i];
                        arr[i]=arr[j];
                        arr[j]=container;
                        }
                    }
                 }

          for(int k=0; k<num;k++){

              sum=sum+arr[k];
          }
          return sum;
  }
}
