class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        
        // If any complexity[i] <= complexity[0] for i>0, impossible
        for (int i = 1; i < n; i++) {
            if (complexity[i] <= complexity[0]) return 0;
        }

        // compute (n-1)! % MOD
        long ans = 1;
        int MOD = 1000000007;
        for (int i = 1; i <= n - 1; i++) {
            ans = (ans * i) % MOD;
        }
        return (int) ans;
    }
}