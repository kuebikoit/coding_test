package SafalKoirala.second;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public static   int[] countVowelConsonant(String input) {
    int vowel=0;
    int con=0;
    String str=input.toUpperCase();


    for (int i = 0; i <= str.length() - 1; i++) {
      char ch = str.charAt(i);
      if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        vowel++;
      }
    }
    con=str.length()-vowel;
    System.out.println(vowel);
    System.out.println(con);
//    ar=new int[]{vowel,con};
   return new int[]{vowel,con};
  }

  public static void main(String[] args) {
    int[] out=countVowelConsonant("Helloworld");
    System.out.println(out);
  }
}
