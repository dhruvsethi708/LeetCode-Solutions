class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];

        for(int i = nums.length-1; i>=0; i--){
            
            if(i==nums.length-1){
                dp[i]=nums[nums.length-1];
            }else if(i==nums.length-2){
                dp[i]=nums[nums.length-2];
            }else if(i==nums.length-3){
                dp[i]=nums[nums.length-3] + nums[nums.length-1];
            }else{
                dp[i] = nums[i] + Math.max(dp[i+2], dp[i+3]);            
            }
        }
        if(dp.length>=2){
            return Math.max(dp[0], dp[1]);        
        }else{
            return dp[0];
        }
    }
}