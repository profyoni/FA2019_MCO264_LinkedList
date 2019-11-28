package edu.touro.cmo264;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTest {
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
        int actual = Recursion.factorialR(100);
        assertNotEquals(3628800, actual);

    }

}

