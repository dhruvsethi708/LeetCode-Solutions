class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] ans = new int[k];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
                                                        // Lambda Function
        PriorityQueue<Integer> pque = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        
        for(int n: map.keySet()){
            pque.add(n);
            if(pque.size() > k){
                pque.poll();
            }
        }
        
        int i = 0;
        while(pque.size()>0){
            ans[i] = pque.poll();
            i++;
        }
        
        return ans;
        
    }
}