//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int N, int[] arr) {
    // code here
    
        int dp[][] = new int[N][N];

        for(int g = 0; g<dp.length; g++){
            for(int i = 0, j = g; j<dp.length; i++, j++){
                int max = Integer.MIN_VALUE;

                for(int k = i; k<=j; k++){
                    int left = k==i ? 0 : dp[i][k-1];
                    int right = k==j ? 0 : dp[k+1][j];
                    
                    int val = arr[k];
                    if(i>0) val = val*arr[i-1];
                    if(j!=arr.length-1) val = val*arr[j+1];

                    int total = left + right + val;

                    if(total>max) max = total;
                }
            dp[i][j] = max;
            }
        }

        return dp[0][dp.length-1];

  }
}
     