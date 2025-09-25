import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> numSet1 = new HashSet<>();
        Set <Integer> numSet2 = new HashSet<>();
        for(int n : nums1){
            numSet1.add(n);
        }
        for(int N : nums2){
            numSet2.add(N);
        }
        
        Set <Integer> numSet = new HashSet<>(numSet1);
        numSet.retainAll(numSet2);

        int len = numSet.size();
        int[] intersectArray = new int[len];
        int j = 0;
        for(int i : numSet){
            intersectArray[j++] = i;
        }
        return intersectArray;

    }
}