class Solution {
    public int maxLength(List<String> arr) {
        
        List<String> anslist = new ArrayList<>();
        int ans = 0;
        
        anslist.add("");
        for(String str: arr){
            
            if(!checkunique(str)) continue;
            
            List<String> list = new ArrayList<>();
            
            for(String candidate: anslist){
                String temp = str + candidate;
                
                if(checkunique(temp)){
                    list.add(temp);
                    ans = Math.max(ans, temp.length());
                }
            }
            
            anslist.addAll(list);
        }
        
        return ans;
    }
    
    boolean checkunique(String str){
        if(str.length()>26) return false;
        
        int[] freq = new int[26];
        
        for(int i = 0; i<str.length(); i++){
            freq[str.charAt(i)-'a']++;
            if(freq[str.charAt(i) - 'a'] > 1) return false;
        }
        
        return true;
    }
}