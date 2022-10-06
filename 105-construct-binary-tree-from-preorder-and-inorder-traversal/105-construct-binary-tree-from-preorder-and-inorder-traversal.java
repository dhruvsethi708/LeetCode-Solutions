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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode res = helper(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
        
        return res;
    }
    
    public TreeNode helper(int[] preorder, int[] inorder, int ps, int pe, int ins, int ine) {
        
        if(ps>pe){
            return null;
        }
        
        int value = preorder[ps];
        TreeNode node = new TreeNode(value);
        
        int idx = -1;
        for(int i = 0; i<=ine; i++){
            if(inorder[i]==value){
                idx=i;
                break;
            }
        }
        
        int length = idx-ins;
        
        node.left = helper(preorder, inorder, ps+1, ps+length, ins, idx-1);
        node.right = helper(preorder, inorder, ps+length+1, pe, idx+1, ine);

        return node;
    }
}