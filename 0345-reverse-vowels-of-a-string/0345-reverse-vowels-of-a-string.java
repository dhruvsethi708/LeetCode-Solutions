class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        // Storing all the vowels in the word in stringbuilder
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                sb.append(s.charAt(i));
            }
        }
        
        // reversing the stringbuilder
        sb.reverse();
        
        int idx = 0;
        String ans = "";
        
        // traversing through the word again
        //If the character is vowel adding from stringbuilder in the ans string 
        //else adding the character of the word
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                ans += sb.charAt(idx);
                idx++;
            }else{
                ans += s.charAt(i);
            }
        }
        
        return ans;
    }
}