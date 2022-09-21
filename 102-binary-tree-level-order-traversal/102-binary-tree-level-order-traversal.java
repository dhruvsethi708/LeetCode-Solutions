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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null) {
            return l;
        
        }
        
        q.add(root);
        
        while(!q.isEmpty()) {
        
            int levelSize = q.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode tempNode = q.remove();
                levelList.add(tempNode.val);
                if(tempNode.left != null) q.add(tempNode.left);
                if(tempNode.right != null) q.add(tempNode.right);
            }
            l.add(levelList);
        }
        return l;        
    }
}