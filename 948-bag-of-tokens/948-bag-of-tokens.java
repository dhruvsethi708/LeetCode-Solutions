class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0;
        int r = tokens.length-1;
        int score = 0;
        int maxscore = 0;
        
        while(l<=r){
            if(power>=tokens[l]){
                power = power - tokens[l];
                l++;
                score++;
                maxscore = Math.max(score, maxscore);
            }else if(score>0){
                power = power + tokens[r];
                r--;
                score--;
            }else{
                break;
            }
        }
        
        return maxscore;
    }
}