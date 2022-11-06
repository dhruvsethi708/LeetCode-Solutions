class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        // if remainder of sum till n1 with k and remainder of sum till n2 with k is same then subaaray from n1 to n2 is divisible by k.
        
        // sum1 = n1*k + x
        // sum2 = n2*k + x
        // sum2 - sum1 = n'*k which is divisible by k
        
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); // remainder of sums frequency
        
        map.put(0,1);
        
        int sum = 0;
        int rem = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            rem = sum%k;
            
            if(rem < 0){
                rem+=k;
            }
            
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);  
            }else{
                map.put(rem, 1);
            }
        }
        
        return ans;
    }
}