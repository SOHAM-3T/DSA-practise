class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for (int j = n; j > 1; j--) {
            for (int i = 0; i < j - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }
}
