class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;
        
        while(low<nums.length-1 && nums[low]<=nums[low+1]){
            low++;
        }
        
        if(low==nums.length-1) return 0;
        
        while(high>0 && nums[high]>=nums[high-1]){
            high--;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = low; i<=high; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        
        while(low>0 && nums[low-1]>min){
            low--;
        }
        
        while(high<nums.length-1 && nums[high+1]<max){
            high++;
        }
        
        return high-low+1;

    }
}