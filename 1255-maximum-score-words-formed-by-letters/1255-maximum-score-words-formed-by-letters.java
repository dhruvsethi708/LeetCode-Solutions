class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        
        int[] freq = new int[26];
		for (int i = 0; i < letters.length; i++) {
			freq[letters[i] - 'a']++;
		}
        
        int ans = helper(words, freq, score, 0);
        
        return ans;
    }
    
    int helper(String[] words, int[] freq, int[] score, int idx){
        
        if(idx==words.length) return 0;
        
        //not include or siword is 0
        int sno = 0 + helper(words, freq, score, idx+1);
        
        //include
        int siword = 0;
        String word = words[idx];
        boolean flag = true; //true if word can be made
        
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            
            if(freq[ch - 'a'] <= 0){
                flag = false;
            }
            
            freq[ch - 'a']--;
            siword += score[ch - 'a'];
        }
        
        int syes = 0;
        if(flag){
            syes = siword + helper(words, freq, score, idx+1);
        }
        
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        
        return Math.max(sno, syes);
    }
}