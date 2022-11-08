class Solution {
    public String makeGood(String s) {
        
        int idx = 0;
        int diff = Math.abs('A'-'a');
        
        while(idx < s.length()-1){
            char ch1 = s.charAt(idx);
            char ch2 = s.charAt(idx+1);
            
            if(Math.abs(ch1-ch2) == diff){
                s = s.substring(0, idx) + s.substring(idx+2);
                idx = Math.max(idx-1, 0);
            }else{
                idx++;
            }
        }
        
        return s;
    }
}