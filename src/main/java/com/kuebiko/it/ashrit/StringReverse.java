package com.kuebiko.it.ashrit;


/**
 * Reverse string
 */
public class StringReverse {
    public String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            stringBuilder.append(s.charAt(i));
        }
       // String str = new StringBuilder(s).reverse().toString();
        return stringBuilder.toString();
    }


}
