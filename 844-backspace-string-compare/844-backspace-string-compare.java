class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        StringBuilder str1 = new StringBuilder();
        Stack<Character> st2 = new Stack<>();
        StringBuilder str2 = new StringBuilder();

        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='#' && st1.size()>0){
                st1.pop();
            }else if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
        }
        
        
        for(int j = 0; j<t.length(); j++){
            if(t.charAt(j)=='#' && st2.size()>0){
                st2.pop();
            }else if(t.charAt(j)!='#'){
                st2.push(t.charAt(j));
            }
        }
        
        while(st1.size()>0){
            str1.append(st1.pop());
        }
        
        while(st2.size()>0){
            str2.append(st2.pop());
        }
        
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        
        return false;

    }
}