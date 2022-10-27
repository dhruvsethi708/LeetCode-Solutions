class Solution {
    public int minOperations(int n) {
        
//         int count = 0;
        
//         int i = 0;
//         int j = n.length;
//         int mid = n/2;
        
//         while()
        
        if(n%2!=0){
            int mid = n/2;
            int midval = 2*mid+1;
            
            int ans = 0;
            int val = midval-1;
            while(val!=0){
                ans = ans + val;
                val = val-2;
            }
            
            return ans;
            
        }else{
            
            int mid = n/2;
            int midval = 2*mid-1;
            
            int ans = 0;
            int val = midval;
            while(val!=-1){
                ans = ans + val;
                val = val-2;
            }
            
            return ans;
        }
    }
}