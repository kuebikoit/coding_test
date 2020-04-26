/**
 * Given two string arguments s1, s2
 * return a string removing s2 from s1 ignoreCase
 * return "N/A" if s2 is not found in s1
 *
 * eg. s1 = "HelloWorld", s2 = "World" => "Hello"
 *  s1 = "JustDoIt", s2 = "do" => "JustIt"
 *  s1 = "DoesntContain", s2 = "this" => "N/A"
 */
public class StringRemoval {

  public static String remove(String s1, String s2) {
    int pos= s1.indexOf(s2);
    String str="";
    for(int i = 0; i<pos;i++){
      str = str+s1.charAt(i);
    }
    for(int i = s2.length()+pos; i<s1.length();i++){
      str=str+s1.charAt(i);
    }
    return str;
  }
}
