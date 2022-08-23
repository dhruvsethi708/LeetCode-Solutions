class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = combine("",digits);
        
        if(ans.size()==1){
            return new ArrayList<>();
        }
        else {
            return ans;
        }
    }
    
    public static ArrayList<String> combine(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        
        int i=(digit-2)*3;
        
        if(digit>7) i++;
        
        int len = i+3;
        
        if(digit==7 || digit == 9){
            len++;
        }
        for(;i<len;i++){
            char ch = (char)('a' + i);
            list.addAll(combine(p+ch,up.substring(1)));
        }
        
        return list;
    }
}