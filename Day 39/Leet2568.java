import java.util.*;
class Solution {
    public int minImpossibleOR(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int x : nums) {
            s.add(x);
        }
        for (int i = 0; ; i++) {
            int cand = 1 << i;//evry left shift multiplies the number by 2
            if (!s.contains(cand)) return cand;
        }
    }
}