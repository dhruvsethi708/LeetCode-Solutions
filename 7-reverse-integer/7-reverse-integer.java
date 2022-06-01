class Solution {
    public int reverse(int x) {
        
        
        
        int result = 0;
        int prev = 0;
        
    
        while (x != 0)
        {
            int remainder = x % 10;
            // System.out.println(result);
            result = (result * 10) + remainder;
            // System.out.println(result);
            x = x / 10;
            // System.out.println(x);
            if((result-remainder)/10 != prev){
                return 0;
            } 
            prev = result;
        }
        
        if(result >= Math.pow(2,31)-1 || result <= Math.pow(2,31)*(-1)){
            return 0;
        }
        // return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0: (int) result;
        return result;
    }
}