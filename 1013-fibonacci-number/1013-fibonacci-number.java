class Solution {
    int[] memo;
    public int fib(int n) {
        memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1; 
        }
        return fib1(n,n-1);
    }


    public int fib1(int n, int m) {
        // Check if the result is already memoized
        if (memo[n] != -1) {
            return memo[n];
        }

        // Base case: if n <= 1
        if (n <= 1) {
            memo[n] = n;
        } else {
            // Recursive case: calculate Fibonacci with modulo
            memo[n] = (fib1(n - 1, m) + fib1(n - 2, m)) ;
        }

        return memo[n];
    }

}