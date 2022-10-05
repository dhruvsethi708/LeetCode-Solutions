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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode ans =  helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return ans;
    }
    
    int idx = 0;
    
    public TreeNode helper(int[] preorder, int lr, int rr){
        
        if(idx>=preorder.length || preorder[idx] > rr || preorder[idx] < lr){
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;
        
        node.left = helper(preorder, lr, node.val);
        node.right = helper(preorder, node.val, rr);

        return node;
    }
}