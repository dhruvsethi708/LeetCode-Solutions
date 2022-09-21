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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        
        List<Integer> res = new ArrayList<>();
        
        function(root, res);

        return res;
    }
    
    void function(TreeNode A, List<Integer>list){
        
        if(A == null){
            return;
        }
        
        function(A.left, list);
        list.add(A.val);
        function(A.right, list);
    }
}