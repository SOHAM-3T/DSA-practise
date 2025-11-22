class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int mod = ((num % 3) + 3) % 3;
            if (mod == 0) continue;
            int stepsUp = (3 - mod) % 3; 
            int stepsDown = mod;        
            count += Math.min(stepsUp, stepsDown);
        }
        return count;
    }
}

