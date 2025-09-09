class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007; //10^9 + 7
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long sharing = 0;
        
        for (int day = 2; day <= n; day++) {
            if (day - delay >= 1) {
                sharing = (sharing + dp[day - delay]) % MOD;
            }
            if (day - forget >= 1) {
                sharing = (sharing - dp[day - forget] + MOD) % MOD;//Add MOD to make difference positive
            }
            dp[day] = sharing;
        }
        long result = 0;
        for (int i = Math.max(1, n - forget + 1); i <= n; i++) {
            result = (result + dp[i]) % MOD;
        }
        
        return (int) result;
    }
}