package com.kuebiko.it.Sajan;

/**
 * Given string "str" remove duplicate characters ignoring case
 * eg. str = "abbccca" => "abc"
 * str = "HeLloOo" => "HeLo"
 * str = "Batmaan" => "Batmn"
 * str = "riverside" => "rivesd"
 *
 * Bonus points
 * Look hint in imports
 */
public class RemoveDuplicateCharacters {

  public static String remove(String str) {
    String newString = Character.toString(str.charAt(0));
    for (int i = 1; i<str.length(); i++){
      boolean dup = true;
      for (int j = 0; j < newString.length(); j++){
        if(str.charAt(i)== (Character.toLowerCase(newString.charAt(j))) ||
                str.charAt(i)== (Character.toUpperCase(newString.charAt(j)))) {
          dup =false;
        }
      }
      if(dup){
        newString += str.charAt(i);
      }
    }

    return newString;
  }
}
