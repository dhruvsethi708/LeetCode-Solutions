class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        
        long totalsum = 0;
        for(int i = 0; i<n; i++){
            totalsum += nums[i]; 
        }
        
        long min = Long.MAX_VALUE;
        long sumtilli = 0;
        int ans = 0;
        
        for(int i = 0; i<n-1; i++){
            sumtilli += nums[i]; 
            long avgdiff = Math.abs(sumtilli/(i+1) - (totalsum-sumtilli)/(n-i-1));
            
            if(avgdiff<min){
                ans = i;
                min = avgdiff;
            }
        }
        
        sumtilli += nums[n-1];
        
        if(sumtilli/n<min){
            ans=n-1;
        }
        return ans;
    }
}