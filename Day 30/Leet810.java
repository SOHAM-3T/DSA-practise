class Solution {
    public boolean xorGame(int[] nums) {
        boolean isEvenLength = nums.length % 2 == 0;
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        return isEvenLength || xorSum == 0;
    }
}
