class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int ans = numBottles;
        int empty = numBottles;
        
        while(empty>=numExchange){
            numBottles = empty/numExchange;
            empty = numBottles + empty%numExchange;
            ans = ans+numBottles;
            
        }
        
        return ans;
    }
}