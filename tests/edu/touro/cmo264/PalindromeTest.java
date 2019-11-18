package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    /**
     * Case insensitive palindrome check
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s)
    {
        for (int i=0;i<s.length()/2;i++)
        {
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(s.length() - i - 1)))
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

