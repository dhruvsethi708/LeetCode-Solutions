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
    
    private int ans = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        height(root);
        return ans;

    }
    
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int ld = height(root.left);
        int rd = height(root.right);
        
        ans = Math.max(ans, ld+rd);
        
        return 1+Math.max(ld,rd);
    }
}