class Solution {
    public int concatenatedBinary(int n) {
        int newno = 0;
        
        int mod = 1000000007;
        
        for(int i = 1; i<=n; i++){
            String binary = Integer.toBinaryString(i);
            
            for(char ch: binary.toCharArray()){
                int val = 0;
                if(ch=='0'){
                    val = 0;
                }else{
                    val = 1;
                }
                
                newno = ((newno*2)%mod + val)%mod;
            }
        }
        
        return newno;
    }
}