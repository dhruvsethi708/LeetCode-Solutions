class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]){
                int temp = nums[i];
                nums[i] = nums[correctindex];
                nums[correctindex] = temp;
            }else{
                i++;
            }
        }
        
        for(int j = 0; j<nums.length; j++){
            if(j !=nums[j]-1){
                arr.add(j+1);
            }
        }
        return arr;
    }
}