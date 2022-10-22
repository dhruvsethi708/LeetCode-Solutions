class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(nums1.length>nums2.length){
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int i = 0; i<nums1.length; i++){
                if(!map.containsKey(nums1[i])){
                    map.put(nums1[i], 1);
                }
            }
            
            for(int j = 0; j<nums2.length; j++){
                if(map.containsKey(nums2[j])){
                    ans.add(nums2[j]);
                    map.remove(nums2[j]);
                }
            }
            
            int res[]=new int[ans.size()];
            for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
            return res;
            
        }else{
            
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for(int i = 0; i<nums2.length; i++){
                if(!map.containsKey(nums2[i])){
                    map.put(nums2[i], 1);
                }
            }
            
            for(int j = 0; j<nums1.length; j++){
                if(map.containsKey(nums1[j])){
                    ans.add(nums1[j]);
                    map.remove(nums1[j]);
                }
            }
            
            int res[]=new int[ans.size()];
            for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
            return res;
            
        }
    }
}