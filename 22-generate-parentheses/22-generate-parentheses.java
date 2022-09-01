class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        call("",0,0,n,ans);
        return ans;
    }

    void call(String s, int open, int close, int n, List<String> ans){
        
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        
        if(open<n){
            call(s+"(", open+1, close, n, ans);
        }
        
        if(close<open){
            call(s+")", open, close+1, n, ans);
        }
    }
}
