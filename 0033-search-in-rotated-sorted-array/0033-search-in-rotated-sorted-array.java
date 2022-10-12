class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int st = 0;
        int end = n-1;
        while(st<=end){
            int mid = (st + end)/2;
            
            if(target==nums[mid]){
                return mid;
            }else if(nums[st]<=nums[mid]){
             
                if(target<nums[mid] && target>=nums[st]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }else{
                
                if(target>nums[mid] && target<=nums[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}