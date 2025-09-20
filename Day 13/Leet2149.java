class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] negArray = new int[n/2];
        int[] posArray = new int[n/2];
        int k = 0;//for negArray
        int l = 0;//for posArray
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                negArray[k++] = nums[i];
            }
            else{
                posArray[l++] = nums[i];
            }
        }
        //Merge of two Arrays
        int a = 0;
        int b = 0;
        int c = 0;
        while(a<n/2 && b<n/2){
            nums[c++] = posArray[a++];
            nums[c++] = negArray[b++];
        }
        return nums;
    }
}