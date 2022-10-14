class Solution {
    public int nthUglyNumber(int n) {
        
        int[] dp = new int[n + 1];
        int pos2 = 1;
        int pos3 = 1;
        int pos5 = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[pos2] * 2, Math.min(dp[pos3] * 3, dp[pos5] * 5));
            if (dp[i] == 2 * dp[pos2]) {
                pos2++;
            }
            if (dp[i] == 3 * dp[pos3]) {
                pos3++;
            }
            if (dp[i] == 5 * dp[pos5]) {
                pos5++;
            }
        }
        return dp[n];
    }
}