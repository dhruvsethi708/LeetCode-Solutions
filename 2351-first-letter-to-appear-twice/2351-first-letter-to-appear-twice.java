class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        char ans = 'a';
        for(int i = 0; i<s.length(); i++){
            if(arr.contains(s.charAt(i))){
                ans = s.charAt(i);
                break;
            }else{
                arr.add(s.charAt(i));
            }
        }
        
        return ans;
    }
}