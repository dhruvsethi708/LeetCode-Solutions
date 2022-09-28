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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int depth = height(root.left) + height(root.right) + 2;
        
        return Math.max(left, Math.max(right, depth));

    }
    
    int height(TreeNode root){
        if(root==null){
            return -1;
        }
        
        int ld = height(root.left);
        int rd = height(root.right);
        
        int td = Math.max(ld,rd) + 1;
        
        return td;
    }
}