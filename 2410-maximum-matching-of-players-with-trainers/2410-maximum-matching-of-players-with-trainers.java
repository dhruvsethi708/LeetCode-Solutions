class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int ans = 0;
        
        int i = players.length-1;
        int j = trainers.length-1;

        while(i>=0 && j>=0){
            if(players[i]<=trainers[j]){
                ans++;
                i--;
                j--;
            }else{
                i--;
            }
        }
        
        return ans;

    }
}