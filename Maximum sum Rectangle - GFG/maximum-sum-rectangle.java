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
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        
        int[] sum = new int[R];
        
        int maxsum = Integer.MIN_VALUE;
        
        for(int cstart = 0; cstart<C; cstart++){
            Arrays.fill(sum, 0);
            for(int cend = cstart; cend<C; cend++){
                for(int row = 0; row<R; row++){
                    sum[row] += M[row][cend];
                }
                int currmaxsum = kadane(sum);
                maxsum = Math.max(maxsum, currmaxsum);
                
            }
        }
        
        return maxsum;
    }
    
    static int kadane(int a[]){
        int size = a.length;
        int maxsofar = Integer.MIN_VALUE;
        int maxendinghere = 0;
        
        for(int i = 0; i<size; i++){
            maxendinghere += a[i];
            
            if(maxsofar < maxendinghere) maxsofar = maxendinghere;
            
            if(maxendinghere < 0) maxendinghere = 0;
        }
        
        return maxsofar;
    }
};