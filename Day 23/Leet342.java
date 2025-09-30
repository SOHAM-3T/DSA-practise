class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (Integer.bitCount(n) != 1) {
            return false;
        }
        if ((n - 1) % 3 != 0) {
            return false;
        }
        return true;
    }
}
