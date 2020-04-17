package com.kuebiko.it.karya;

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

  public static String remove(String s1, String s2) {
    String s3;
    if (s1.contains(s2)) {
      s3 = s1.replace(s2, "");

      return s3;
    } else
      return "N/A";
  }

  public static void main(String[] args) {
    System.out.println(remove("JustDoIt", "do"));
  }
}
