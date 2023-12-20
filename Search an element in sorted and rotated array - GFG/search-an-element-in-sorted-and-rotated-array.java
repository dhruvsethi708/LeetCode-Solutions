//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int A[], int key)
	{
	    // code here
	    
	    int l = 0;
	    int h = A.length-1;
	    
	    while(l<=h){
            int mid = (l+h)/2;
            
            if(A[mid] == key) return mid;
            
            if(A[l] <= A[mid]){
                if(A[l] <= key && A[mid] > key){
                    h = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                if(A[mid] < key && A[h] >= key){
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }
        
        return -1;
	}
} 

