//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{
    int[] dp;

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    
	    dp = new int[V+1];
	    
	    int ans = helper(coins, V);
	    
	    return ans==Integer.MAX_VALUE ? -1 : ans;
	} 
	
	int helper(int coins[], int V){
	    
	    if(V==0) return 0;
	    
	    if(V < 0) return Integer.MAX_VALUE;
	    
	    int min = Integer.MAX_VALUE;
	    
	    if(dp[V] != 0) return dp[V];
	    
	    for(int i = 0; i<coins.length; i++){
	        
	        int ans = helper(coins, V-coins[i]);
	        
	        if(ans != Integer.MAX_VALUE){
	            min = Math.min(min, 1 + ans);
	        }
	        
	    }
	    
	    dp[V] = min;
	    
	    return min;
	}
}