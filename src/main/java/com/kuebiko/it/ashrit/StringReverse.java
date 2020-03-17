package com.kuebiko.it.ashrit;


/**
 * Reverse string
 */
public class StringReverse {
    public String reverse(String s) {
        String str = new StringBuilder(s).reverse().toString();
        return str;
    }


}
