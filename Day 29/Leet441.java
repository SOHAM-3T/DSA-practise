class Solution {
    public int arrangeCoins(int n) {
        /* n^2 + n - 2c = 0
        n = [ -1 + sqrt(1+8c) ]/2
        */
        return (int)((-1 + Math.sqrt(1 + 8.0 * n)) / 2);
    }
}