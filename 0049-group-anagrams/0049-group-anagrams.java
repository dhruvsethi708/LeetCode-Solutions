class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        // key - hashmap, value - arraylist of string
        
        for(String str: strs){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i = 0; i<str.length(); i++){
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch,0)+1);
            }
            
            if(map.containsKey(fmap)==false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(fmap, list);
            }else{
                ArrayList<String> list = map.get(fmap);
                list.add(str);
            }
        }
        
        for(ArrayList<String> val: map.values()){
            ans.add(val);
        }
        
        return ans;
    }
}