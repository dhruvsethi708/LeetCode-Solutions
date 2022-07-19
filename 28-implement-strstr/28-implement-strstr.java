class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()>haystack.length()){
            return -1;
        }else{
            int index = haystack.indexOf(needle);
            return index;             
        }   
        
    }
}