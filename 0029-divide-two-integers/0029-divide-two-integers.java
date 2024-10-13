class Solution {
    public int divide(int dividend, int divisor) {
        // 1010 
        // 0011
        return dividend == -2147483648 && divisor == -1 ? 2147483647 : dividend/divisor;
    }
}