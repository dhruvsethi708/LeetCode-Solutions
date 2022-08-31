class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        boolean[] visited = new boolean[nums.length];
        
        call(res, nums, new ArrayList<>(), visited);
        return res;
    }
    
    void call( List<List<Integer>> res, int[] nums,  List<Integer> curr, boolean[] visited){
        
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = 0; i<nums.length; i++){
            if(visited[i]){
                continue;
            }
            curr.add(nums[i]);
            visited[i]= true;
            call(res,nums,curr,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}