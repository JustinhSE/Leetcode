class Solution {
    int[] memo;
    public int fib(int n) {
        return fib1(n,n-1);
    }


    public int fib1(int n, int m) {
        if (n <= 1) {
            return n ;
        }

        // Initialize variables for the iterative computation
        int prev = 0; // Fib(0)
        int cur = 1 ; // Fib(1)

        // Compute Fibonacci numbers iteratively
        for (int i = 2; i <= n; i++) {
            int next = (prev + cur) ; // Compute next Fibonacci number modulo m
            prev = cur; // Update prev to the current value
            cur = next; // Update cur to the next value
        }

        return cur; // Return the nth Fibonacci number modulo m
    }

}