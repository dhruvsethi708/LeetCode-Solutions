class Solution {
    public boolean reorderedPowerOf2(int n) {

        char[] num = String.valueOf(n).toCharArray();
        Arrays.sort(num);
        
        for(int i = 0; i<31; i++){
            int curr = (int)Math.pow(2,i);
            
            char[] charcurr = String.valueOf(curr).toCharArray();
            Arrays.sort(charcurr);
            
            if(Arrays.equals(num,charcurr)){
                return true;
            }
        }
        
        return false;
        
        
        
    }
    
}