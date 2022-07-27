class Solution {
    public boolean isPowerOfTwo(int n) {
        // int x = n;
        // if(x<0){
        //     x = -x;
        // }
        // if(x==1){
        //     return true;
        // }
        // while(x!=1){
        //     if(x%2==0){
        //         x/=2;
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
        
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
        
    }
}