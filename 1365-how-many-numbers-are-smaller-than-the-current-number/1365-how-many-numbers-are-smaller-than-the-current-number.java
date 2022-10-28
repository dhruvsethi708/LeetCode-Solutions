class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums) list.add(num);
        
        Collections.sort(list);
        
        for(int i=0;i<nums.length;i++){
            ans[i] = list.indexOf(nums[i]);
        }
        
        return ans;
    }
}