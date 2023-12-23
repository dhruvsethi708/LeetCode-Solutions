//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            char A[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) A[i][j] = S[j].charAt(0);
            }
            Solution ob = new Solution();
            System.out.println(ob.largestSubsquare(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    class pair{
		int x;
		int y;
		public pair(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
    
    int largestSubsquare(int n, char arr[][]) {
        // code here
        
        int max=0;
		int m=arr[0].length;

		pair dp[][]=new pair[n][m];
 	
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]=='O') {					
					dp[i][j]=new pair(0,0);
				}else {	
					max=1;
					if(i==0 && j==0)
						dp[i][j]=new pair(1,1);
					
					else if(i==0 && j!=0) 							
							dp[i][j]=new pair(1,dp[i][j-1].y+1);
						
					else if(j==0 && i!=0)
						dp[i][j]=new pair(dp[i-1][j].x+1,1);
					else {
							dp[i][j]=new pair(dp[i-1][j].x+1,dp[i][j-1].y+1);
					}				
					
				}
			}
		}
		
	
		for(int i=n-1;i>=1;i--) {
			for(int j=m-1;j>=1;j--){
				int min=Math.min(dp[i][j].x,dp[i][j].y);					
				while(min>0 && min>max) {
					pair temp1=dp[i-min+1][j];
					pair temp2=dp[i][j-min+1];
					if(temp1.y>=min && temp2.x>=min ) {
						max=Math.max(max, min);
					}
					min--;
				}
			}
		}
		
		return max;
    }
};