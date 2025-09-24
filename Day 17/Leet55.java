class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        int i = 0;
        while(i<n && i<=reach){
            reach = Math.max(reach,nums[i]+i);
            i++;
        }
        if(i == n){
            return true;
        }
        return false;
    }
}
