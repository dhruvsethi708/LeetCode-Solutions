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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if (root == null) return res;
        
        Queue<TreeNode> nodesqueue = new ArrayDeque<>();
        nodesqueue.add(root);
        
        // flag means travel left to right
        boolean flag = false;
        
        while(!nodesqueue.isEmpty()){
            int size = nodesqueue.size();
            List<Integer> currlist = new ArrayList<>();
            
            for(int i = 0; i<size; i++){
                TreeNode node = nodesqueue.remove();
                currlist.add(node.val);
                if(node.left!=null) nodesqueue.add(node.left);
                if(node.right!=null) nodesqueue.add(node.right);

            }
            
            if(flag==true){
                Collections.reverse(currlist);
            }
            
                flag=!flag;
                res.add(currlist);
            
        }
        
        return res;
        
        
    }
}