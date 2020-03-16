package com.kuebiko.it.bidur;

/**
 * Given string "str" remove duplicate characters ignoring case
 * eg. str = "abbccca" => "abc"
 * str = "HeLloOo" => "HeLo"
 * str = "Batmaan" => "Batmn"
 * str = "riverside" => "rivesd"
 * <p>
 * Bonus points
 * Look hint in imports
 */
public class RemoveDuplicateCharacters {

    public static String remove(String str) {
        char[] char_arr = str.toCharArray();
        String new_str = String.valueOf(char_arr[0]);
        for (int i = 1; i < char_arr.length; i++) {
          String check= String.valueOf(Character.toLowerCase(char_arr[i]));
          String lower_new_string= new_str.toLowerCase();
          if (!lower_new_string.contains(check)) {
            new_str = new_str + char_arr[i];
          }
        }
        return new_str;
    }
}
