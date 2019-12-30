package com.kuebiko.it;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoHash {
    public static void check(HashMap<Integer, String> hmap, int key, String value) {
        if (hmap.containsKey (key)) {
            if (hmap.get (key).equals (value)) {
                System.out.println ("True");
                return;
            }
        }
        System.out.println ("False");

    }

    public static void printKey(HashMap<Integer, String> number) {

        System.out.println ("The number of keys are " + number.keySet ());
    }

    public static void main(String[] args) {

        HashMap<Integer, String> value = new HashMap<Integer, String> ();
        value.put (1, "Apple");
        value.put (2, "Banana");
        value.put (3, "Cat");
        value.put (4, "Dog");
        value.put (5, "Elephant");
        System.out.println ("The output is ::" + value);
        value.put (6, "Frog");
        System.out.println ("The final output" + value);
        value.replace (1, "Onion");
        System.out.println ("Final=== " + value);

        check (value, 1, "Banana");
        check (value, 2, "Onion");
        printKey (value);
        value.clear ();
        printKey (value);

        boolean val = true;

        while (val) {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("please enter the KEY==");
            int key;
            try {
                key = scanner.nextInt ();
                int i = 1;
                if (key >= 1 && key <= 6) {
                    String ires = value.get (key);

                } else if (key == 9) {
                    System.exit (9);
                } else {
                    System.out.println ("Invalid key");
                }

                System.out.println ("output===" + value.get (key));
                System.out.println ("");

            } catch (InputMismatchException e) {
                System.out.println ("Input Miss matched");

            }

        }

    }
}


