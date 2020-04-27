package com.kuebiko.it.bidur;
/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

    public static int[] countVowelConsonant(String input) {
        String input1= input.toLowerCase();
        char[] input_copy = input1.toCharArray();
        int vowel_count=0;
        int cons_count=0;
        for (int i=0; i<input_copy.length; i++){
            if(input_copy[i]=='a' || input_copy[i]=='e' || input_copy[i]=='i' || input_copy[i]=='o' || input_copy[i]=='u'){
                vowel_count++;
            }
            else{
              cons_count++;
            }
        }
        return new int[]{vowel_count, cons_count};
    }
}