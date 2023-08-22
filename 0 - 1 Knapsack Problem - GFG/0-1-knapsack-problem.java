//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         
         int[][] dp = new int[W+1][n+1];
         for (int i = 0; i < W + 1; i++)
            for (int j = 0; j < n + 1; j++)
                dp[i][j] = -1;
         
         return helper(W, wt, val, 0, dp);
         
    } 
    
    static int helper(int W, int wt[], int val[], int i, int[][] dp){
        
        if(i==wt.length || W==0){
            return 0;
        }
        
        if(dp[W][i] != -1){
            return dp[W][i];
        }
        
        if(wt[i] <= W){
            int include = val[i] + helper(W-wt[i], wt, val, i+1, dp);
            int exclude = helper(W, wt, val, i+1, dp);
            
            dp[W][i] = Math.max(include, exclude);
            return dp[W][i];
            
        }else{
            return dp[W][i] = helper(W, wt, val, i+1, dp); //exclude
        }
    }
}


