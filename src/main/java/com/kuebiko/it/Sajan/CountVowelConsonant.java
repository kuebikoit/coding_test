package com.kuebiko.it.Sajan;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public int[] countVowelConsonant(String input) {
    int [] count = {0,0};
    for(int i = 0; i<input.length(); i++){
      if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'||
              input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
        count[0]++;
      }
      else
        count[1]++;
    }
    return count;
  }
}
