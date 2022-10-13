class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        List<String> ans = new ArrayList<>();
        
        helper(s, "", wordDict, ans);
        
        return ans;
        
    }
    
    void helper(String s, String res, List<String> wordDict, List<String> ans){
        
        if(s.length() == 0){
            ans.add(res.trim());
            return;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            String l = s.substring(0, i+1);
            
            if(wordDict.contains(l))
            {
                String r = s.substring(i+1);
                helper(r, res+l+" ", wordDict, ans);
                
            }
        }

    }
    
    
}