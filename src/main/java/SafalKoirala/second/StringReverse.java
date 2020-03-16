package SafalKoirala.second;

/**
 * Reverse string
 *
 */
public class StringReverse {
  String rev="";
  public  String reverse (String str){
    for(int i =str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    return rev;
  }
}
