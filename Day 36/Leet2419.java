class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int mx = nums[0];
        for (int x : nums) mx = Math.max(mx, x);
        int longest = 0;
        int cur = 0;
        for (int x : nums) {
            if (x == mx) {
                cur++;
                longest = Math.max(longest, cur);
            } else {
                cur = 0;
            }
        }
        return longest;
    }
}
