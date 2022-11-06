class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        
        
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Boolean> used = new HashMap<>();

        String[] words = s.split(" "); 
        
        if(words.length != pattern.length()) return false;
        
        for(int i = 0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch)==false){
                if(used.containsKey(words[i])) return false;
                else{
                    map.put(ch, words[i]);
                    used.put(words[i], true);
                }
            }else{
                if(map.get(ch).equals(words[i])==false) return false;
            }
        }
        
        return true;
    }
}