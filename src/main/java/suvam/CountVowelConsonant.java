package suvam;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public int[] countVowelConsonant(String input) {

    int vCount = 0;
    int cCount = 0;
    char vowelCount[] = input.toCharArray();


    for (int i = 0; i < vowelCount.length; i++) {
      if ((vowelCount[i]) == 'a' || vowelCount[i] == 'e' || vowelCount[i] == 'i' || vowelCount[i] == 'o' || vowelCount[i] == 'u' ||
              (vowelCount[i]) == 'A' || vowelCount[i] == 'E' || vowelCount[i] == 'I' || vowelCount[i] == 'O' || vowelCount[i] == 'U'
      ) {
        vCount++;
      } else {
        cCount++;
      }

    }

    int index[] = {vCount, cCount};
    return index;

  }

  }



//  static int index[] = {2,3};
//
//  public static void main(String[] args) {
//    char[] vowelCount = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
//
//
//    int[] ret = indexReturn(vowelCount);
//    System.out.println(Arrays.toString(ret));
//
//
//  }




