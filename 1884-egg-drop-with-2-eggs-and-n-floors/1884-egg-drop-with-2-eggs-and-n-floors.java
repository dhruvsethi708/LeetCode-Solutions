class Solution {
    public int twoEggDrop(int n) {
        
        // Pattern - 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5..................
        
        int i = 1;
        
        while(n>0){
            n=n-i;
            i++;
        }
        
        return i-1;
    }
}