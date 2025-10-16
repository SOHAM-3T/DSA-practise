import java.util.*;
class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        final long MOD = 1_000_000_007L;
        int n = nums.length;
        long[] finals = new long[n];

        //Compute final positions ignoring collisions
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                finals[i] = (long) nums[i] + d;
            } else {
                finals[i] = (long) nums[i] - d;
            }
        }
        //Sort the final positions
        Arrays.sort(finals);

        //Compute the total pairwise distance
        long res = 0;
        long prefix = 0;
        for (int i = 0; i < n; i++) {
            long contrib = (long) i * finals[i] - prefix;
            res = (res + contrib) % MOD;
            prefix += finals[i];
        }
        if (res < 0) res += MOD;
        return (int) (res % MOD);
    }
}