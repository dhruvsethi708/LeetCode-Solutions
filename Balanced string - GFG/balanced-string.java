//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int N) {
        // code here
        
        StringBuilder ans = new StringBuilder();
        StringBuilder allch = new StringBuilder();
        
        for(int i = 0; i<26; i++){
            allch.append((char)('a'+i));
        }
        
        int allchtimes = N/26;
        int r = N%26;
        
        while(allchtimes-->0){
            ans.append(allch);
        }
        
        if(N%2==0){
            for(int i = 0; i<r/2; i++) ans.append((char)('a'+i));
            for(int i = 26-(r/2); i<26; i++) ans.append((char)('a'+i));
        }else{
            int sod = 0;
            int temp = N;
            
            while(temp>0){
                sod += temp%10;
                temp/=10;
            }
            
            if(sod%2==0){
                for(int i = 0; i<(r+1)/2; i++) ans.append((char)('a'+i));
                for(int i = 26-((r-1)/2); i<26; i++) ans.append((char)('a'+i));
            }else{
                for(int i = 0; i<(r-1)/2; i++) ans.append((char)('a'+i));
                for(int i = 26-((r+1)/2); i<26; i++) ans.append((char)('a'+i));
            }
        }
        
        return ans.toString();
    }
}