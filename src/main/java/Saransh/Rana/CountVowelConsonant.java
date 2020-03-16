package Saransh.Rana;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public int[] countVowelConsonant(String input) {

    int vowelCount = 0;
    int consonantsCount =0;

    String str = input.toLowerCase();

      for(int i = 0; i < input.length(); i++){
        if(str.charAt(i) =='a' || str.charAt(i) =='e'|| str.charAt(i) =='i'
                ||str.charAt(i) =='o' || str.charAt(i) =='u'){
          vowelCount++;
        }
        else{
          consonantsCount++;
        }

      }
      int counter [] = {vowelCount,consonantsCount};
      return counter;
  }

}


