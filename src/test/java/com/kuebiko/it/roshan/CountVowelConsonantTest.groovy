package com.kuebiko.it.roshan

import org.junit.Assert
import org.junit.Test

class CountVowelConsonantTest {


        @Test
        void a() {
            CountVowelConsonant inst = new CountVowelConsonant();
            String input = "HelloWorld";
            int[] ans = inst.countVowelConsonant(input);
            Assert.assertArrayEquals([3, 7] as Object[], ans);


        }

        @Test
        void b() {
            CountVowelConsonant inst = new CountVowelConsonant();
            String input = "KuebikoIt";
            int[] ans = inst.countVowelConsonant(input);
            Assert.assertArrayEquals([4, 4] as Object[], ans);


        }


}