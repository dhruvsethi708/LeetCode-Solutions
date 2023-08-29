//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.MinSquares(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int[] dp;
    public int MinSquares(int n)
    {
        // Code here
        
        dp = new int[n+1];
        
        int ans = helper(n);
        
        return ans;
    }
    
    int helper(int n){
        
        if(n == 0) return 0;
        
        if(n < 0) return 0;
        
        if(dp[n] != 0) return dp[n];
        
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i*i<=n; i++){
            int temp = 1 + helper(n-i*i);
            ans = Math.min(temp, ans);
        }
        
        return dp[n] = ans;
    }
}