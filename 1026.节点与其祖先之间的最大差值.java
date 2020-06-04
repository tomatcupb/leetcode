/*
 * @lc app=leetcode.cn id=1026 lang=java
 *
 * [1026] 节点与其祖先之间的最大差值
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
    public int maxAncestorDiff(TreeNode root) {
        // 多次递归dfs,效率低，6.05 %， 50%。
        // helper(root);
        // return ans;


        // 一次dfs, 效率高，100%， 50%
        helper(root, root.val, root.val);
        return ans;
    }

    int ans = 0;
    // 由于是dfs,可以记住每条路径上的max和min
    // 这些记住的max和min是后边遍历节点的祖先节点
    // 每遍历一个节点，计算其与max和min的最大差值即可
    private void helper(TreeNode root, int max , int min){
        if(root==null) return;
        ans = Math.max(ans, Math.max(Math.abs(max-root.val), Math.abs(min-root.val)));
        if(root.val>max) max = root.val;
        if(root.val<min) min = root.val;

        helper(root.left, max, min);
        helper(root.right, max, min);
    }

    // int ans = 0;
    // private void helper(TreeNode root){
    //     if(root==null) return;
    //     int max = maxTree(root);
    //     int min = minTree(root);
        
    //     ans = Math.max(ans, Math.max(Math.abs(max-root.val), Math.abs(min-root.val)));
    //     helper(root.left);
    //     helper(root.right);
    // }

    // private int maxTree(TreeNode root){
    //     if(root == null) return Integer.MIN_VALUE;
    //     return Math.max(Math.max(maxTree(root.left), maxTree(root.right)), root.val);
    // }

    // private int minTree(TreeNode root){
    //     if(root == null) return Integer.MAX_VALUE;
    //     return Math.min(Math.min(minTree(root.left), minTree(root.right)), root.val);
    // }
}
// @lc code=end

