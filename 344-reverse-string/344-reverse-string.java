class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    
    public void reverse(char[] chars, int start, int end){
        if(start>end){
            return;
        }
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        
        reverse(chars, ++start, --end);
    }
}