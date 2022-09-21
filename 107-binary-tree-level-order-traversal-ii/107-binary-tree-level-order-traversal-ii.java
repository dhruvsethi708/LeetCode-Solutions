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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        call(root, ans);
        
        Collections.reverse(ans);
        
        return ans;
    }
    
     void call(TreeNode root, List<List<Integer>> list){
        
        if(root==null){
            return;
        }
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size()>0){
            int count = q.size(); 
            List<Integer> ls = new ArrayList<>();
            
            for(int i = 0; i < count; i++){
                
                TreeNode curr = q.remove();
                ls.add(curr.val);
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            list.add(ls);
        }
        
    }
}