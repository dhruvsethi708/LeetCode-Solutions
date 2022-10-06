class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        
        for(int i = 0; i<n; i++){
            ans[i] = 'a';
        }
        
        k = k - n; //As 'a' value is 1 

        int i = n-1;
        
        while(k!=0){
            if(k>25){
                ans[i] += 25;
                i--;
                k = k-25;
            }else{
                ans[i] += k;
                i--;
                k=0;
            }
        }
        
        return String.valueOf(ans);

    }
}