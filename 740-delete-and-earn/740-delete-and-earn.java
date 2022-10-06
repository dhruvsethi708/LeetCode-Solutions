class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] dp = new int[10001];
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            max = Math.max(nums[i], max);
            dp[nums[i]] += nums[i]; //increasing count*i directly
        }
        
        for(int i = 2; i<=max; i++){
            dp[i] = Math.max(dp[i] + dp[i-2], dp[i-1]);
        }
        
        return Math.max(dp[max], dp[max-1]);
        
    }
}