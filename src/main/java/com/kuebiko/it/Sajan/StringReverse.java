package com.kuebiko.it.Sajan;

/**
 * Reverse string
 *
 */
public class StringReverse {
    public String stringReverser(String str){
        String reversed = "";
        for(int i =str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

}
