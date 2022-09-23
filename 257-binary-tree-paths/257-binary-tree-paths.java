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
    private List<String> res = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        Paths(root, new StringBuilder());
        
        return res;
    }
    
    void Paths(TreeNode root, StringBuilder path){
        
        if(root==null){
            return;
        }
        
        path.append(root.val);
        path.append("->");
        
        if(root.left == null && root.right == null){
            res.add(path.toString().substring(0, path.length()-2));
            return;
        }
        else{
            Paths(root.left, new StringBuilder(path));
            Paths(root.right, new StringBuilder(path));
        }

    }
}