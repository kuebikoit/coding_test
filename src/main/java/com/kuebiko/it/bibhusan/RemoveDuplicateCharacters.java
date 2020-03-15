package com.kuebiko.it.bibhusan;

import java.util.*;

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
        // Using Linked Hash Map
        Map<Character, Character> uniqueCharacters = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (!uniqueCharacters.containsKey(c)) // searches if the character c is already there in Linked Hash Map as a key
            {
                uniqueCharacters.put(c, str.charAt(i));
            }
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry mapElement : uniqueCharacters.entrySet()) {
            sb.append(mapElement.getValue());

        }
        return sb.toString();
    }
}


