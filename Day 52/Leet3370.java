class Solution {
    public int smallestNumber(int n) {
        for (int i = 0; ; i++) {
            int val = (int) (Math.pow(2, i) - 1);
            if (val >= n) {
                return val;
            }
        }
    }
}
