class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // sliding window
        
        int start = 0;
        int match = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(int end = 0; end<s2.length(); end++){
            char rightchar = s2.charAt(end);
            
            if(map.containsKey(rightchar)){
                map.put(rightchar, map.get(rightchar)-1);
                if(map.get(rightchar)==0){
                    match++;
                }
            }
            
            if(match==map.size()){
                return true;
            }
            
            if(end >= s1.length()-1){
                char leftchar = s2.charAt(start);
                start++;
                
                if(map.containsKey(leftchar)){
                    if(map.get(leftchar)==0){
                        match--;
                    }
                    
                    map.put(leftchar, map.get(leftchar)+1);
                }
            }
        }
        
        return false;
    }
}