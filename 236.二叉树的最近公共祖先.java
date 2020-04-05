import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
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
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return ans;
    }

    private boolean helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return false;
        int flagL = helper(root.left, p, q)?1:0;
        int flagR = helper(root.right, p, q)?1:0;
        int flagM = (root.val == p.val || root.val == q.val)?1:0;
        if(flagL+flagM+flagR>1){
            ans = root;
            return true;
        }
        return (flagL+flagM+flagR)>0;
    }   
}
// @lc code=end

