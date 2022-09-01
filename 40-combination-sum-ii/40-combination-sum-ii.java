class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        
        call(candidates, target, new ArrayList<>(), ans, 0, -1);
        return ans;
        
    }
    
    void call(int[] candidates, int target, List<Integer> list, List<List<Integer>> ans, int index, int prev){
        
        if(target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index >= candidates.length){
            return;
        }
        
        if (candidates[index] == prev){
            call(candidates, target, list, ans, index + 1, prev);
            return;
        }
        
        list.add(candidates[index]);
        call(candidates, target-candidates[index], list, ans, index+1, -1);
        list.remove(list.size() - 1);
        call(candidates, target, list, ans, index + 1, candidates[index]);

      
    }
    
    
}