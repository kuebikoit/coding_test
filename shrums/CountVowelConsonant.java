import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

/**
 * Count the number of vowel and consonant in a given string of only alphabets
 * and return in two element array first contains number of vowels
 * second the number of consonants
 * eg. "HelloWorld" => [3, 7]
 * "KuebikoIt" => [5, 4]
 */
public class CountVowelConsonant {

  public  int[] countVowelConsonant(String input) {
    int len = input.length();

    String s = input.toLowerCase();
    //String immutable, returns the modified value, it doesn't modify the value of the instance you are calling this method on.
    //above is an important step becus, it will create a new loweredcase string which we are using below, not "input" old one.
    int cnt=0;
    int[] ans = new int[2];
    for(int i=0;i<len;i++){
      char c= s.charAt(i);
      if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u' )
        cnt++;
    }
    ans[0]=cnt;
    ans[1] = len-cnt;
    return ans ;
  }

}
