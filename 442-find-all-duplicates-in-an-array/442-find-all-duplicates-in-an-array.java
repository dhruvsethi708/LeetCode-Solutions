class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
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
        
        List<Integer> arr = new ArrayList<>();
        
        for(int j = 0; j<nums.length; j++){
            if(j+1!=nums[j]){
                arr.add(nums[j]);
            }
        }
        return arr;
    }
}