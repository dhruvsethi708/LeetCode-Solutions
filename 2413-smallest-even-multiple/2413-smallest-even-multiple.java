class Solution {
    public int smallestEvenMultiple(int n) {
        
        //hcf is highest common factor of 2 and n.
        int hcf = 1;
        
        // Calculating hcf
        for(int i = 1; i<=2 && i<=n; i++){
            if(2%i==0 && n%i==0){
                hcf = i;
            }
        }
        
        // LCM of 2 numbers a and b is (a*b)/hcf(a,b)
        
        return (2*n)/hcf;
    }
}