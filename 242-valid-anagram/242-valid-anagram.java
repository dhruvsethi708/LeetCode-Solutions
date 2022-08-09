class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String s1 = new String(a);
        
        char[] b = t.toCharArray();
        Arrays.sort(b);
        String s2 = new String(b);
        
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}