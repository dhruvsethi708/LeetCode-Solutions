class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return targetSum(nums,0,0,target);
    }
    
    int targetSum(int[] arr, int i, int sos, int target){
        
        if(i == arr.length){
            if(sos==target){
                return 1;            
            }else{
                return 0;
            }
        }
            
        
        int pos = targetSum(arr, i+1, sos+arr[i], target);
        int neg = targetSum(arr, i+1, sos-arr[i], target);

        return pos+neg;
        
    }
}