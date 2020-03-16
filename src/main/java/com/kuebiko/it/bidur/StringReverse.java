package com.kuebiko.it.bidur;

/**
 * Reverse string
 *
 */
public class StringReverse {
    public static String stringReverse(String str){
        char[] str_copy = str.toCharArray();
        String result = String.valueOf(str_copy[str_copy.length-1]);
        for(int i = str_copy.length-2; i>=0; i--){
            result = result + str_copy[i];
        }
        return result;
    }
}
