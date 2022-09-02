class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) {
            return true;
        }
        if(n<10 && n!=1){
            return false;
        }
        
        int sos = 0;

        while(n>0){
            int rem = n%10;
            sos += Math.pow(rem,2);
            n/=10;
        }
        
        return isHappy(sos);
    }
}