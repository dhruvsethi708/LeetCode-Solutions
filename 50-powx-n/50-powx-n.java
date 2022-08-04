class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        
        long newn = n;
        
        if(newn<0){
            newn = -1*newn;
        }
        while(newn>0){
            if(newn%2==1){
                result *= x;
                newn--;
            }else{
                x = x*x;
                newn /= 2;
            }
        }
        
        if(n<0){
            result = 1 / result;
        }
        return result;

    }
}