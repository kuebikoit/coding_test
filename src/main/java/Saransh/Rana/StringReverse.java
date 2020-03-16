package Saransh.Rana;

/**
 * Reverse string
 *
 */
public class StringReverse {

    String reverse="";

    public String reverseString (String str){

        for(int i = str.length()-1; i>=0 ; i--){
            reverse = reverse+str.charAt(i);
        }
        return reverse;

    }


}
