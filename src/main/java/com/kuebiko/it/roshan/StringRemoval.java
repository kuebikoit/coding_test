package com.kuebiko.it.roshan;

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

    /*Lowercase the strings to compare */
    String s1LowCase=s1.toLowerCase();
    String s2LowCase=s2.toLowerCase();

    StringBuilder s1B= new StringBuilder(s1);
    int s2Length = s2.length();
    int indexHolder = s1LowCase.indexOf(s2LowCase);
    int endIndexHolder = indexHolder+s2Length;
    StringBuilder finalString;
    String finalOutput;


          if(indexHolder>=0){
              finalString= s1B.delete(indexHolder,endIndexHolder);
              finalOutput = finalString.toString();
          }

          else{
              finalOutput="N/A";
          }

    return finalOutput;

  }
}
