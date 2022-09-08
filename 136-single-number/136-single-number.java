class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        
        Arrays.sort(nums);
        int ans = -1;
        int i = 0;
        while(i<nums.length){
            if(i+1==nums.length){
                ans = nums[i];
                break;
            }else if(nums[i]==nums[i+1]){
                i = i+2;
            }
            else{
                ans = nums[i];
                break;
            }
        }
        
        return ans;
    }
}