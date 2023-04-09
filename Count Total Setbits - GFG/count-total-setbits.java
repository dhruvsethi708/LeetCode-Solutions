//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.countBits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countBits(int n){
        // code here
        
        if(n==0){
            return 0;
        }
        
        int x = largestpowerof2inrange(n);
        
        int btill2x = x * (1 << (x-1));
        int msb2xton = n - (1 << x) + 1;
        int rest = n - (1 << x);
        int ans = btill2x + msb2xton + countBits(rest);
        
        return ans;
        
    }
    
    static int largestpowerof2inrange(int n){
        int x = 0;
        
        while((1<<x) <=n){
            x++;
        }
        
        return x-1;
    }
}