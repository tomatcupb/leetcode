import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 */

// @lc code=start
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
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0; 
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode node = q.remove();
                path(node, sum);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return count;

        // if(root == null) return 0;            
        // path(root,sum);
        // pathSum(root.left,sum);
        // pathSum(root.right,sum); 
        // return count;
    }
    
    private void path(TreeNode root, int sum){
        if(root == null){
            return; 
        }
        if(root.val==sum){
            ++count;
        }
        path(root.left, sum-root.val);
        path(root.right, sum-root.val);
    }
}
// @lc code=end

