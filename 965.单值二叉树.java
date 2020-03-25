/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null && root.left.val != root.val){
            return false;
        }
        if(root.right!=null && root.right.val != root.val){
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
// @lc code=end

