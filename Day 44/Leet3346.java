import java.util.*;
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        TreeMap<Integer, Integer> differenceArray = new TreeMap<>();
        for (int num : nums) {
            frequencyMap.merge(num, 1, Integer::sum);
            differenceArray.putIfAbsent(num, 0);
            differenceArray.merge(num - k, 1, Integer::sum);
            differenceArray.merge(num + k + 1, -1, Integer::sum);
        }
        int maxResult = 0;
        int currentOverlappingRanges = 0;
        for (Map.Entry<Integer, Integer> entry : differenceArray.entrySet()) {
            int position = entry.getKey();
            int deltaValue = entry.getValue();
            currentOverlappingRanges += deltaValue;
            int achievableFrequency = Math.min(
                currentOverlappingRanges, 
                frequencyMap.getOrDefault(position, 0) + numOperations
            );
            maxResult = Math.max(maxResult, achievableFrequency);
        }
        return maxResult;
    }
}