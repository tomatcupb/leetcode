/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String leaf1 = root1 == null ? "":dfs(root1);
        String leaf2 = root2 == null ? "":dfs(root2);
        return leaf1.equals(leaf2);
    }

    private String dfs(TreeNode root){
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        sb = sb.append(dfs(root.left));
        if(root.left == null && root.right == null){
            sb.append(root.val);
        }
        sb.append(dfs(root.right));
        return sb.toString();
    }
}
// @lc code=end

