class Solution {
    public String reverseWords(String s) {
        
        s.trim();
        String[] str = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length-1; i>=0; i--){
            sb.append(str[i] + " ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        String ans = sb.toString();
        
        for(int i = 0; i<ans.length()-1; i++){
            if(ans.charAt(i)==' '){
                if(ans.charAt(i+1)==' '){
                    ans = ans.substring(0,i+1) + ans.substring(i+2);
                    i--;
                }
            }
        }
        
        return ans.trim();
    }
}