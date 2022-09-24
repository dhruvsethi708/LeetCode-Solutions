/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> res;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<TreeNode> path = ntr(root, target.val);
        res = new ArrayList<>();
        for(int i=0;i<path.size();i++){
            printklevelsdown(path.get(i), k-i, i==0?null:path.get(i-1));
        }
        return res;
    }
    
    void printklevelsdown(TreeNode root, int k, TreeNode blocker){
        if(root==null || k<0 || root==blocker){
            return;
        }
        
        if(k==0){
          res.add(root.val);   
        }
        printklevelsdown(root.left, k-1, blocker);
        printklevelsdown(root.right, k-1, blocker);

    } 
    
    List<TreeNode> ntr(TreeNode root, int data){
        if(root==null){
            return new ArrayList<>();
        }
        if(root.val==data){
            return new ArrayList<TreeNode>(Arrays.asList(root));
        }
        
        List<TreeNode> res = ntr(root.left, data);
        if(res.size()==0){
            res = ntr(root.right, data);
        }
        if(res.size()!=0){
            res.add(root);
        }
        return res;
    }
}