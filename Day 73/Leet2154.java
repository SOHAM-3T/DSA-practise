class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(search(nums,original)){
            original=original*2;
        }
        return original;
    }
    public boolean search(int[] nums,int key){
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                return true;
            }
        }
        return false;
    }
}