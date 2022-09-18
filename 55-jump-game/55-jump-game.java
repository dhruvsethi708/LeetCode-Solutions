class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        
        boolean[] dp = new boolean[n];
        
        dp[n-1] = true;
        
        for(int i = n-2; i>=0; i--){
            if(i+nums[i] >= n-1){
                dp[i]=true;
                continue;
            }
            
            for(int j = i+1; j<=nums[i]+i; j++){
                if(dp[j]==true){
                    dp[i]=true;
                    break; 
                }
            }
        }
        
        return dp[0];
    }
}