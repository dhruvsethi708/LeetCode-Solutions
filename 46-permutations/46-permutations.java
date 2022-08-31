class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] bool = new boolean[nums.length]; 
        call(nums,0,new ArrayList<>(),ans,bool);
        return ans;
    }
    
    void call(int[] nums, int index, List<Integer> list, List<List<Integer>> ans, boolean[] bool){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i<nums.length; i++){
            if(bool[i]){
                continue;
            }
            list.add(nums[i]);
            bool[i]=true;
            call(nums,index+1,list,ans,bool);
            list.remove(list.size()-1);
            bool[i]=false;

        }
    }
}