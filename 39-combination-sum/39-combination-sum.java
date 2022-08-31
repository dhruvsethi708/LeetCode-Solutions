class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        sum(candidates, 0, target, ans, new ArrayList<>());
        
        return ans;
        
    }
    
    void sum(int[] candidates, int index, int target, List<List<Integer>> ans, List<Integer> list){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));     
            }   
            return;
        }
        
    
        
        if(candidates[index]<=target){
            list.add(candidates[index]);
            sum(candidates, index, target-candidates[index], ans, list);
            list.remove(list.size()-1);
        }
        
        sum(candidates, index+1, target, ans, list);

    }
}