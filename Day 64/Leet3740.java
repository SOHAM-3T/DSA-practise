import java.util.*;
class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        Map<Integer, Integer> secondLastSeen = new HashMap<>();

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (secondLastSeen.containsKey(value)) {
                int firstIndex = secondLastSeen.get(value);
                int currentDist = 2 * (i - firstIndex);
                minDistance = Math.min(minDistance, currentDist);
                secondLastSeen.put(value, lastSeen.get(value));
                lastSeen.put(value, i);
                
            } else if (lastSeen.containsKey(value)) {
                secondLastSeen.put(value, lastSeen.get(value));
                lastSeen.put(value, i);
                
            } else {
                lastSeen.put(value, i);
            }
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}