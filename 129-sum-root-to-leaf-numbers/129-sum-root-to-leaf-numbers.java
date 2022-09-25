/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        
        call(root, root.val);
        
        return sum;
    }
    
    void call(TreeNode root, int currsum){
        if(root.left==null && root.right==null){
            sum += currsum;
        }
        
        if(root.left != null){
            call(root.left, currsum*10+root.left.val);
        }
        
        if(root.right != null){
            call(root.right, currsum*10+root.right.val);
        }
    }
}