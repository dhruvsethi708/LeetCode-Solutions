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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        TreeNode res = helper(inorder, postorder, 0, postorder.length-1, 0, inorder.length-1);
        
        return res;
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int ps, int pe, int ins, int ine) {
        
        if(ps>pe){
            return null;
        }
        
        int value = postorder[pe];
        TreeNode node = new TreeNode(value);
        
        int idx = -1;
        for(int i = 0; i<=ine; i++){
            if(inorder[i]==value){
                idx=i;
                break;
            }
        }
        
        int length = idx-ins;
        
        node.left = helper(inorder, postorder, ps, ps+length-1, ins, idx-1);
        node.right = helper(inorder, postorder, ps+length, pe-1, idx+1, ine);

        return node;
    }
}