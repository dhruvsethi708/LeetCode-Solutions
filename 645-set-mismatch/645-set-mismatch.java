class Solution {
    public int[] findErrorNums(int[] nums) {
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
        
        int arr[] = new int[2];
        
        for(int j = 0; j<nums.length; j++){
            if(j+1!=nums[j]){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }
}