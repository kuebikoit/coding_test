package com.kuebiko.it.roshan;

/**
 * Given array "arr" and string "str" that contains "A" for add and "S" for subtract
 * find the total after adding/subtracting "arr" in order of "A" and "S"
 * eg. arr = [5, 4, 2, 1, 3], str = "ASA" => 8 (5 + 4 - 2 + 1)
 * arr = [11, 1, 3, 15, 21], str = "AA" => 15 (11 + 1 + 3)
 * arr = [10, 12, 113, 2, 15], str = "AASA" => 148 (10 + 12 + 113 - 2 + 15)
 */
public class AddSubtract {




  public int addSubtract(int[] arr, String str) {

    int valueHolder=0;
    int counterStr=0;
    int arrSize=arr.length;
    int strLength=str.length();

            /* runs a loop in accordance to string size and array size */
            for(int i = 0; (i < arrSize) && (counterStr < strLength); i++){
                /* Need the first operation to be stored in valueHolder variable */
                if(counterStr ==0){
                        if(str.charAt(counterStr)=='A') {
                          valueHolder = valueHolder + arr[i] + arr[i + 1];
                        } else{
                            valueHolder=valueHolder+arr[i]-arr[i+1];
                        }
                        counterStr++;
                }
                /* Store the rest of the operation in valueHolder variable */
                else{

                       if(str.charAt(counterStr)=='A'){
                          valueHolder=valueHolder+arr[i+1];
                      }
                       else{
                          valueHolder=valueHolder-arr[i+1];
                      }
                      counterStr++;
                }
            }

    return valueHolder;
  }
}
