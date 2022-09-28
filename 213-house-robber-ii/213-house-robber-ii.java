class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        
        int x = helper(0, nums.length-1, nums);

        int y = helper(1, nums.length, nums);
        
        return Math.max(x,y);

    }
    
    int helper(int start, int end, int[] nums){
        int[] dp = new int[end];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        
        for(int i = start+2; i<end; i++){
            dp[i] = Math.max(dp[i-2]+ nums[i], dp[i-1]);
        }
        
        return dp[dp.length-1];
    }
}