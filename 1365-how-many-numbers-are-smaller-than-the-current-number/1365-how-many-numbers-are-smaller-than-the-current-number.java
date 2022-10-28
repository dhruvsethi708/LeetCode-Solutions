class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[] = new int[nums.length];
        
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(i!=j && nums[j]<nums[i]){
                    count++;
                }
            }
            
            ans[i] = count;
        }
        
        return ans;
    }
}