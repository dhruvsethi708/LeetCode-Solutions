class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0 || nums.length==1) return nums.length;
        
        Arrays.sort(nums);
        
        int maxlen = 0;
        int len = 1;

        for(int i = 1; i<nums.length; i++){
            
            if(nums[i] == nums[i-1] + 1){
                len++;
            }else{
                len = nums[i]==nums[i-1]? len : 1;
            }
            
            if(len>maxlen){
                    maxlen = len;
            }
        }
        
        return maxlen;
    }
}