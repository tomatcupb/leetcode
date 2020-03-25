/*
 * @lc app=leetcode.cn id=606 lang=java
 *
 * [606] 根据二叉树创建字符串
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
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        if(t==null){
            return sb.toString();
        }
        sb.append(t.val);
        if(t.left != null){
            sb.append("(").append(tree2str(t.left)).append(")");
        } else if(t.right != null){
            sb.append("()");
        }
        if(t.right != null){
            sb.append("(").append(tree2str(t.right)).append(")");
        }

        return sb.toString();
    }
}
// @lc code=end

