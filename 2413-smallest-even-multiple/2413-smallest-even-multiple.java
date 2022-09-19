class Solution {
    public int smallestEvenMultiple(int n) {
        
        int gcf = 1;
        for(int i = 1; i<=2 && i<=n; i++){
            if(2%i==0 && n%i==0){
                gcf = i;
            }
        }
        
        return (2*n)/gcf;
    }
}