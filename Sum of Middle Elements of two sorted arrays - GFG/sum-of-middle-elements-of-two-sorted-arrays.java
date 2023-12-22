//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int i = 0, j = 0;
        
        int[] arr = new int[2*n];
        int k = 0;
        
        while(i<n && j<n){
            if(ar1[i] <= ar2[j]){
                arr[k] = ar1[i];
                i++;
                k++;
            }else{
                arr[k] = ar2[j];
                j++;
                k++;
            }
        }
        
        while(i<n){
            arr[k] = ar1[i];
            i++;
            k++;
        }
        
        while(j<n){
            arr[k] = ar2[j];
            j++;
            k++;
        }
        
        // for(int m = 0; m<2*n; m++){
            
        //     System.out.print(arr[m] + " ");
        // }
        
        int ans = arr[n-1] + arr[n];
        
        return ans;
    }
}