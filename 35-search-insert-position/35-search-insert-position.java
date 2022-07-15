class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int high = nums.length-1;
        int low = 0;
        
        while(low<=high){
            int mid =  low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
                }  
            } 
        return low;
        
//         int ans = -1;
        
//         for(int i = 0; i<nums.length; i++){
//             if(!(nums[i]<target)){
//                 ans = i;
//                 break;
//             }
//         }
//         if(ans==-1){
//             return nums.length;
//         }
//         return ans;

    }
}