class Solution {
    public int findPeakElement(int[] nums) {
        
        int ans = -1;
        
        if(nums.length==1){
            return 0;
        }
        
        for(int i =0; i<nums.length; i++){
            if(i!=0 && i!=nums.length-1 && nums[i-1]<nums[i] && nums[i+1]<nums[i]){
                ans = i;
            }
            if( i ==0 && nums[i+1]<nums[i]){
                ans = i;
            }
            if( i == nums.length-1 && nums[i-1]<nums[i]){
                ans = i;
            }
        }
        
        return ans;
    }
}