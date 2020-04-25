package com.kuebiko.it.ashrit;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

    public int[] countVowelConsonant(String input) {
        String s = input.toLowerCase();
        int count = 0;
        int conCount = 0;

//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                count++;
//            } else
//                conCount++;
//        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            } else
                conCount++;
        }
        int[] a = {count, conCount};
        return a;

    }

}
