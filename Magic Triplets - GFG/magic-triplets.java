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
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        // code here
        
        int n = nums.length;
        int res = 0;
        
        for(int i = 1; i < n - 1; i++){
            int temp1 = 0;
            // Left Smaller
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]) temp1++;
            }
            
            if(temp1 == 0) continue; // No left smaller
            
            int temp2 = 0;
            // right greater
            for(int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]) temp2++;
            }
            
            res+= (temp1 * temp2);
        }
        
        return res;
    }
}