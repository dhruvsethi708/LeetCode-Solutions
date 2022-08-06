class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        if(divisor==1){                               
            return dividend;
        }
        
        if(divisor==-1){                              
            return dividend*-1;
        }
        
        int sign = 1;
        if((dividend>=0 && divisor<0) || (dividend<=0 && divisor>0)){
            sign = -1;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        int quotient = 0;
        while (dividend - divisor >= 0) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;

    }
}