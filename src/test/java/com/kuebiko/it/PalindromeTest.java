package com.kuebiko.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void stringDemo() {
    String expected="121";
    String actual= Palindrome.StringDemo ("121");
    assertEquals (expected,actual);
    }
}