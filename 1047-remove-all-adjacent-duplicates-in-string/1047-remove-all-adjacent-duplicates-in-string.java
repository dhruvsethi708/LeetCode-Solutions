class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else if(st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder sb = new StringBuilder();

        if(st.isEmpty()){
            return "";
        }else{            
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
        }
        
        return sb.reverse().toString();
        
    }
}