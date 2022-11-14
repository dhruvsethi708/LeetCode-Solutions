//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        int ans = 1;
        int i=0;
        while(i < N){
            int j = i+1;
            while(j < N && Math.abs(arr[j] - arr[i]) <= 1) j++;
            
            ans = Math.max(ans , j - i);
            i = j;
        }
        return ans;
    }
};