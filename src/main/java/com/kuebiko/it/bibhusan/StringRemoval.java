package com.kuebiko.it.bibhusan;

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
    String s1Copy=s1.toLowerCase();// created a copy of s1 and s2 to make it easier for comparing
    String s2Copy=s2.toLowerCase();
    int startIndex; // the start index of the s2 in  s1
    int endIndex; // the end index of the s2 in s1
    String result="";
    if(!s1Copy.contains(s2Copy)){
      return "N/A"; // base case
    }
    else{
      startIndex=s1Copy.indexOf(s2Copy);
      endIndex=startIndex+s2Copy.length();
      result= s1.substring(0,startIndex);
      result= result+s1.substring(endIndex,s1.length());

    }
    return result;
  }
}
