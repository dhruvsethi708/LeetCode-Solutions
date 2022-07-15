class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        
        for(int i=1; i<strs.length; i++){
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j<Math.min(strs[i].length(), ans.length()); j++){
                if(ans.charAt(j)==strs[i].charAt(j)){
                    sb.append(ans.charAt(j));
                }else{
                    break;
                }
            }
                ans = sb.toString();
                
        }
                return ans;
    }
}