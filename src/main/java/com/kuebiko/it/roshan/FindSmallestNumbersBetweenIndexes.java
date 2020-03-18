package com.kuebiko.it.roshan;

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
    int lowIndex=indexes[0];
    int highIndex=indexes[1];
    int emparrSize=highIndex-lowIndex+1;
    int emparr[]=new int[emparrSize];
    int indexCounter=0;
    int counter;
    /*find the numbers inbetween */
    for(int j=lowIndex;j<highIndex+1;j++){
      emparr[indexCounter]=arr[j];
      indexCounter++;
    }


    /* put the list in ascending order */
    for(int i=0;i<emparr.length;i++){

      for(int j=0;j<emparr.length;j++){
        if(emparr[i]<emparr[j]){
          counter=emparr[i];
          emparr[i]=emparr[j];
          emparr[j]=counter;
        }
      }
    }

    return emparr[0];
  }
}
