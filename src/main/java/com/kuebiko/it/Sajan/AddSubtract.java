package com.kuebiko.it.Sajan;

/**
 * Given array "arr" and string "str" that contains "A" for add and "S" for subtract
 * find the total after adding/subtracting "arr" in order of "A" and "S"
 * eg. arr = [5, 4, 2, 1, 3], str = "ASA" => 8 (5 + 4 - 2 + 1)
 * arr = [11, 1, 3, 15, 21], str = "AA" => 15 (11 + 1 + 3)
 * arr = [10, 12, 113, 2, 15], str = "AASA" => 148 (10 + 12 + 113 - 2 + 15)
 */
public class AddSubtract {

  public int addSubtract(int[] arr, String str) {
    int len = arr[0];
    int looper = str.length();
    if(str.length()>=arr.length){
      looper= arr.length -1;
    }
    for (int i = 1; i<=looper; i++){
      if(str.charAt(i-1)=='a'|| str.charAt(i-1)=='A'){
        len +=arr[i];
      }
      else if(str.charAt(i-1)=='s'|| str.charAt(i-1)=='S'){
        len =len - arr[i];
      }
      else
        System.out.println("Input error. Please input string consisting only with a and s");
    }



    return len;
  }
}
