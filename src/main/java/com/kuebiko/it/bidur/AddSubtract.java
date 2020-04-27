package com.kuebiko.it.bidur;

/**
 * Given array "arr" and string "str" that contains "A" for add and "S" for subtract
 * find the total after adding/subtracting "arr" in order of "A" and "S"
 * eg. arr = [5, 4, 2, 1, 3], str = "ASA" => 8 (5 + 4 - 2 + 1)
 * arr = [11, 1, 3, 15, 21], str = "AA" => 15 (11 + 1 + 3)
 * arr = [10, 12, 113, 2, 15], str = "AASA" => 148 (10 + 12 + 113 - 2 + 15)
 */
public class AddSubtract {

  public int addSubtract(int[] arr, String str) {
    // get the first
    int total= arr[0];
    for( int i=0; i<str.length();i++){
      if( str.charAt(i)=='A'){
        total= total+arr[i+1];
      }
      else if(str.charAt(i)=='S'){
        total= total-arr[i+1];
      }
    }
    return total;
  }

}
