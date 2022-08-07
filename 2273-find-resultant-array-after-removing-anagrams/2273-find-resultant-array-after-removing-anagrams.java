class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        
        String temp = "";
        
        for(int i = 0; i<words.length; i++){
            char[] a = words[i].toCharArray();
            Arrays.sort(a);
            String curr = new String(a);
            if (!curr.equals(temp)){
                ans.add(words[i]);                
            }
            temp = curr;
        }
        
        return ans;
    }
}