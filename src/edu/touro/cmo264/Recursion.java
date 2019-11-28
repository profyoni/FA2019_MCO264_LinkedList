package edu.touro.cmo264;

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
