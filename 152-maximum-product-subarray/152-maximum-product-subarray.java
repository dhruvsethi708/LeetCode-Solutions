class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = Integer.MIN_VALUE;
        int currprod = 1;
        
        for(int i = 0; i<nums.length; i++){
            currprod*=nums[i];
            ans = Math.max(ans, currprod);
            
            if(currprod==0){
                currprod=1;
            }
        }
        
        currprod = 1;
        for(int i = nums.length-1; i>=0; i--){
            currprod*=nums[i];
            ans = Math.max(ans, currprod);
            
            if(currprod==0){
                currprod=1;
            }
        }
        
        return ans;
    }
}