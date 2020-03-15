package com.kuebiko.it.bibhusan;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public int[] countVowelConsonant(String input) {
    int noOfConsonant = 0;
    int noOfVowel = 0;
    String inputLowerCase = input.toLowerCase();
    for (int i = 0; i < input.length(); i++) {
      if (inputLowerCase.charAt(i) == 'a' || inputLowerCase.charAt(i) == 'e'
              || inputLowerCase.charAt(i) == 'i' || inputLowerCase.charAt(i) == 'o' ||
              inputLowerCase.charAt(i) == 'u') {
        noOfVowel++;
      }
      else {
        noOfConsonant++;
      }
    }
    int[] output = {noOfVowel, noOfConsonant};
    return output;
  }

}
