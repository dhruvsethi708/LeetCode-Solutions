class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int n = nums.length;
        
        int totalsum = 0;
        for(int k = 0; k<n; k++){
            totalsum += nums[k];
        }
        int currsum = nums[0];
        int osum = nums[0];
        // osum = Math.max(currsum, osum);            

        for(int i = 1; i<n; i++){
            
            if(currsum>=0){
                currsum+=nums[i];
            }else{
                currsum=nums[i];
            }
            osum = Math.max(currsum, osum);            

        }
        
        int currdiff = nums[0];
        int odiff = nums[0];
        // odiff = Math.min(currdiff, odiff);            

        for(int j = 1; j<n; j++){
            if(currdiff<=0){
                currdiff+=nums[j];
            }else{
                currdiff=nums[j];
            }
            
            odiff = Math.min(currdiff, odiff);            

        }
        
        if(totalsum==odiff){
                odiff = Integer.MIN_VALUE;
            }else{
                odiff = totalsum-odiff;
        }
        
        return Math.max(osum, odiff);
    }
}