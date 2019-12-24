package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateWords {
    public static ArrayList<String> findDuplicates(String[ ] arr) {
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]);
                    }
                }
            }

        } return duplicates;
    }


        public static void main(String[] args) {
        String[] n ={"one", "one", "two", "four", "four"};
        System.out.println(findDuplicates(n));


    }
}
