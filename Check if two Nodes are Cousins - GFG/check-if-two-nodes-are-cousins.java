//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
            //Scanner sc = new Scanner(System.in);
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
        	    String X = br.readLine();
        	    String arr[] = X.split(" ");
        	    int x , y;
			    x = Integer.parseInt(arr[0]);
			    y = Integer.parseInt(arr[1]);
			    if(g.isCousins(root,x,y))
			        System.out.println(1);
			     else
			        System.out.println(0);
                t--;
            
        }
    }
  
}


// } Driver Code Ends


/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
//User function Template for Java

class Solution {
    
    // static int par1 = 0, par2 = 0, l1 = 0, l2 = 0;
    
    // Returns true if the nodes with values 'a' and 'b' are cousins. Else returns false
    public boolean isCousins(Node root, int a, int b) {
        // your code here
        // This function should return true if x and y are cousins, else return false
        
        Node parentOne = null;
        Node parentTwo = null;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int len = q.size();
            boolean checkedA = false;
            boolean checkedB = false;

            for(int i=0; i<len; i++) {
                Node temp = q.remove();

                if(temp.left != null) {
                    int val = temp.left.data;
                    if (!checkedA && val == a) {
                        checkedA = true;
                        parentOne = temp;
                    }

                    if (!checkedB && val == b) {
                        checkedB = true;
                        parentTwo = temp;
                    }
                    q.add(temp.left);
                }

                if(temp.right != null) {
                    int val = temp.right.data;

                    if(!checkedA && val == a) {
                        checkedA = true;
                        parentOne = temp;
                    }

                    if(!checkedB && val == b) {
                        checkedB = true;
                        parentTwo = temp;
                    }
                    q.add(temp.right);
                }
            }

            if(checkedA && checkedB) {
                return parentOne != parentTwo;
            }

        }
        return false;
    }
    
    // public void helper(Node root, int a, int b, int level, int prev){
    //     if(root == null) return;
        
    //     if(root.data == a){
    //         l1 = level;
    //         par1 = prev;
    //     }
        
    //     if(root.data == b){
    //         l2 = level;
    //         par2 = prev;
    //     }
        
    //     helper(root.left, a, b, level+1, root.data);
    //     helper(root.right, a, b, level+1, root.data);
    // }

}