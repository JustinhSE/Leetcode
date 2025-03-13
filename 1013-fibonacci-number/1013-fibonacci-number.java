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
        if (memo[n] != -1) {
            return memo[n];
        }

        if (n <= 1) {
            memo[n] = n;
        } else {
            memo[n] = (fib1(n - 1, m) + fib1(n - 2, m)) ;
        }

        return memo[n];
    }

}