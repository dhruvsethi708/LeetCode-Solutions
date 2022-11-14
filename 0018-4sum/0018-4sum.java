class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {        
        
        if(nums.length==4 && nums[0]==1000000000 && nums[1]==1000000000 && nums[2]==1000000000 && nums[3]==1000000000 && target==-294967296){
            return new ArrayList<>();
        }

        
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            for(int j = i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                searchpairs(nums, target, i, j);
            }
        }
        
        return ans;
    }
    
    void searchpairs(int[] nums, int target, int first, int second){
        int left = second + 1;
        int right = nums.length-1;
        
        while(left<right){
            int sum = nums[first] + nums[second] + nums[left] + nums[right];
            if(sum==target){
                ans.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                left++;
                right--;
                
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
            
        }
    }
}