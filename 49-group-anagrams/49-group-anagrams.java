class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
    
        for(String s : strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(mp.containsKey(temp)){
                mp.get(temp).add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                mp.put(temp, list);
            }
        }
    
        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
        
    }
}