package com.kuebiko.it.ashrit;

/**
 * Given two string arguments s1, s2
 * return a string removing s2 from s1 ignoreCase
 * return "N/A" if s2 is not found in s1
 * <p>
 * eg. s1 = "HelloWorld", s2 = "World" => "Hello"
 * s1 = "JustDoIt", s2 = "do" => "JustIt"
 * s1 = "DoesntContain", s2 = "this" => "N/A"
 */
public class StringRemoval {

    public String remove(String s1, String s2) {
        String s3,s4=s1.toLowerCase();
        if (s4.contains(s2.toLowerCase())) {
            s1 = s1.replaceAll("(?i)"+s2,"");
            return s1;
        } else
            return "N/A";
    }
}
