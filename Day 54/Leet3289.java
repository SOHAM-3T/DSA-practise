import java.util.*;
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> dict = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(dict.containsKey(nums[i])){
                dict.put(nums[i],dict.get(nums[i])+1);
            }
            else{
                dict.put(nums[i],1);
            }
        }

        int[] result = new int[2];
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value==2){
                result[j++] = key;
            }

        }
        return result;
    }
}