class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxlength = 0;
        int maxcountofrepeatingcharacter = 0;
        
        for(int end = 0; end<s.length(); end++){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch,0)+1);
            
            maxcountofrepeatingcharacter = Math.max(maxcountofrepeatingcharacter, map.get(ch));
            
            // If character that can be replaced > k  then shrink the window
            if(end-start+1-maxcountofrepeatingcharacter > k){
                char leftch = s.charAt(start);
                map.put(leftch, map.get(leftch)-1);
                start++;
            }
            
            maxlength = Math.max(maxlength, end-start+1);
        }
        
        return maxlength;
    }
}