class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // I + J + K = 0
        // J + K = -I
        
        
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            findtriplets(nums, -nums[i], i+1, ans);
        }
        
        return ans;
    }
    
    void findtriplets(int[] nums, int target, int left, List<List<Integer>> ans){
        
        int right = nums.length-1;
        
        while(left<right){
            int currsum = nums[left] + nums[right];
            
            if(currsum==target){
                ans.add(Arrays.asList(-target, nums[left], nums[right]));
                left++; //to avoid duplicates
                right--;
                
                //to avoid duplicates
                
                while(left<right && nums[left]==nums[left-1]) left++;
                
                while(left<right && nums[right]==nums[right+1]) right--;
                
            }else if(currsum>target){
                right--;
            }else{
                left++;
            }
        }
    }
}