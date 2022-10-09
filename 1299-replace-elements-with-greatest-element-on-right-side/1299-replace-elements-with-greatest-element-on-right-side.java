class Solution {
    public int[] replaceElements(int[] arr) {
        int[] dp = new int[arr.length];
        
        for(int i = arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                dp[i] = -1;
            }else if(i==arr.length-2){
                dp[i] = arr[i+1];
            }else{
                if(arr[i+1]>dp[i+1]){
                    dp[i] = arr[i+1];
                }else{
                    dp[i] = dp[i+1];
                }
            }
        }
        
        return dp;
    }
}