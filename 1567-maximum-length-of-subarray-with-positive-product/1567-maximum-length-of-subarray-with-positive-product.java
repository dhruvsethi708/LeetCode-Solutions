class Solution {
    public int getMaxLen(int[] nums) {
        //     sn       sn en   
        // 1 2 -1  0  3 -2 -1  0  1 1 1 1
        // s    e     s     e     s     e
        int n = nums.length;
        int ans = 0;
        
        for(int i=0; i<n;){
            int s = i;
            while(s<n && nums[s]==0) s++;
            
            int e = s;
            int cntneg = 0;
            int sn = -1, en=-1; // startneg = sn, endneg = en
            while(e<n && nums[e]!=0){
                if(nums[e]<0){
                    cntneg++; 
                    if(sn==-1) sn=e;
                    en=e;
                }
                e++;
            }
            
            if(cntneg%2==0) ans = Math.max(ans, e-s);
            else{
                if(sn!=-1) ans= Math.max(ans, e-sn-1);
                if(en!=-1) ans = Math.max(ans, en-s);
            }
            i=e+1;
        }
        
        return ans;
    }
}