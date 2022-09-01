class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] bool = new boolean[nums.length]; 
        
        call(ans,new ArrayList<>(),0,nums,bool);
        return ans;
        
    }
    
    void call(List<List<Integer>> ans, List<Integer> list, int index, int[] nums,boolean[] bool){
        
        if(index == nums.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList<>(list));
                return;
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            // List<Integer> list = new ArrayList<>();
            if(bool[i]){
                continue;
            }
            list.add(nums[i]);
            bool[i]=true;
            call(ans,list,index+1,nums,bool);
            list.remove(list.size()-1);
            bool[i]=false;
        }
        
    }
    
    
}