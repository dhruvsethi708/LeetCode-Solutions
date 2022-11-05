class Solution {
    public int arrangeCoins(int n) {
        
        long i = 0;
        long coins = 0;
        while(coins<=n){
            i++;
            coins += i;
        }
        
        return (int)i-1;
    }
}