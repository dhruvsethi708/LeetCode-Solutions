//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int n = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[n];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Solution obj = new Solution();
		    int ans = obj.maxDistance(arr, n);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        
        int ans = Integer.MIN_VALUE;
        int one = arr[0]+0;
        int two = -arr[0]+0;
        
        for(int i = 0; i<n; i++){
            one = Math.min(one, arr[i]+i);
            two = Math.min(two, -arr[i]+i);
            ans = Math.max(ans, arr[i]+i - one);
            ans = Math.max(ans, -arr[i]+i - two);
        }
        
        return ans;
    }
    
    
}


