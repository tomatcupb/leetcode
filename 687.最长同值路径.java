import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
        int max = -1;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = longPath(root)>max?longPath(root):max;
        longestUnivaluePath(root.left);
        longestUnivaluePath(root.right);
        return max;
    }

    private int longPath(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftLen = root.left != null && root.val == root.left.val?1:0;
        int rightLen = root.right != null && root.val == root.right.val?1:0;
        return helper(root.left)+helper(root.right)+leftLen+rightLen;
    }

    private int helper(TreeNode root) {
        int path = 0;
        if (root == null)
            return 0;
        if ((root.left != null && root.val == root.left.val) || (root.right != null && root.val == root.right.val)) {
            path++;
            return path + Math.max(helper(root.left), helper(root.right));
        } else {
            return 0;
        }
    }
}
// @lc code=end

