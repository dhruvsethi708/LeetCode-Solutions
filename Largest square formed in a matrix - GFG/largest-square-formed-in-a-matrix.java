//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            String a1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[n][m];
            for(int i = 0;i < n*m;i++)
                mat[i/m][i%m] = Integer.parseInt(a1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maxSquare(n, m, mat));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp; 
    static int maxSquare(int n, int m, int mat[][]){
        // code here
        
        dp = new int[n+1][m+1];
        
        int ans= 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<m; j++){
                int curr = helper(mat, i, j);
                
                ans = Math.max(curr, ans);
            }
        }
        
        return ans;
    }
    
    static int helper(int mat[][], int i, int j){
        
        if(i == mat.length || j == mat[0].length || mat[i][j] == 0){
            return 0;
        }
        
        if(dp[i][j] != 0) return dp[i][j];
        
        int right = helper(mat, i, j+1);
        int diagnal = helper(mat, i+1, j+1);
        int down = helper(mat, i+1, j);
        
        int ans = 1 + Math.min(right, Math.min(diagnal, down));
        
        return dp[i][j] = ans;
    }
}