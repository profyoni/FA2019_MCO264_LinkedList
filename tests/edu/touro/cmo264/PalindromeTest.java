package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    public static boolean isPalindrome(String s)
    {
        for (int i=0;i<s.length()/2;i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false; // returning early
        }
        return true;
    }

    @Test
    void isPalindrome() {
        String s = "racecar";
        assertTrue( isPalindrome(s));

        s= "koik";
        assertTrue( ! isPalindrome(s));

    }
}

