package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Recursion {
    public static int factorial(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

    public static int factorialR(int n) {
        return n<=1 ? 1 : n * factorialR(n-1);
    }
}
class RecursionTest {
    @Test
    void factorialTest() {
        // AAA
        int actual = Recursion.factorialR(5);
        assertEquals(120, actual);
    }
    @Test
    void factorialTest2() {
        // AAA
        int actual = Recursion.factorialR(10);
        assertEquals(3628800, actual);
        assertEquals(Recursion.factorial(10), actual);
    }

    @Test
    void factorialTest3() {
        // AAA
        int actual = Recursion.factorialR(100000);
        assertNotEquals(3628800, actual);

    }

}
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

