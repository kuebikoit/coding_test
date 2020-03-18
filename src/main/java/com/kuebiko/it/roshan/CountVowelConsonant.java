package com.kuebiko.it.roshan;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public int[] countVowelConsonant(String input) {

    char []vowel = new char[]{'a','e','i','o','u'};
    int size=input.length();
    int vowelCounter=0;
    int consonantCounter=0;
    String lcaseInput=input.toLowerCase();

        for(int i=0;i<size;i++){
            for(int j=0; j<=4;j++) {

                if (lcaseInput.charAt(i)==vowel[j] ){
                      vowelCounter++;
                }

            }
        }

    consonantCounter=size-vowelCounter;

    return new int[]{vowelCounter,consonantCounter};
  }

}
