class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        
        if(nums.length<3){
            return nums[nums.length-1];
        }
        
        int n = nums.length;
        while(count<3 && n>1){
            n--;
            
            if(nums[n]!=nums[n-1]){
                count++;
            }
        }
        
        if(count<3){
            return nums[nums.length-1];
        }
        
        return nums[n-1];
    }
}