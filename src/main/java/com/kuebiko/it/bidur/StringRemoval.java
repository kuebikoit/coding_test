package com.kuebiko.it.bidur;

/**
 * Given two string arguments s1, s2
 * return a string removing s2 from s1 ignoreCase
 * return "N/A" if s2 is not found in s1
 *
 * eg. s1 = "HelloWorld", s2 = "World" => "Hello"
 *  s1 = "JustDoIt", s2 = "do" => "JustIt"
 *  s1 = "DoesntContain", s2 = "this" => "N/A"
 */
public class StringRemoval {

  public String remove(String s1, String s2) {
    String s1_copy = s1;
    String s2_copy = s2;
    String result=null;
    if(s1_copy.toLowerCase().contains((s2_copy.toLowerCase()))){
      result= s1_copy.replaceAll("(?i)"+s2_copy,"");
      return result;
    }
    return "N/A";
  }
}
