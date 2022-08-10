class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            }else{
                i++;
            }
        }
        
        for(int j = 0; j<nums.length; j++){
            if(j+1!=nums[j]){
                return nums[j];
            }
        }
        return -1;
    }
}