/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树结点最小距离
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
    // int min = Integer.MAX_VALUE;

    int min = Integer.MAX_VALUE;
    TreeNode cur = null;
    public int minDiffInBST(TreeNode root) {
        // if(root == null) return Integer.MAX_VALUE;
        // if(root.left == null && root.right == null) return min;
        // min = Math.min(min, helper(root));
        // minDiffInBST(root.left);
        // minDiffInBST(root.right);
        // return min;

        if(root == null) return Integer.MAX_VALUE;
        minDiffInBST(root.left);
        if(cur!=null){
            min = Math.min(min, Math.abs(cur.val-root.val));
        }
        cur = root;
        minDiffInBST(root.right);
        return min;
    }

    // private int helper(TreeNode root){
    //     if(root == null) return Integer.MAX_VALUE;
    //     TreeNode cur = root.left;
    //     TreeNode pre = root;
    //     int left = Integer.MAX_VALUE;
    //     int right = Integer.MAX_VALUE;
    //     if(cur!=null){
    //         while(cur!=null){
    //             pre = cur;
    //             cur = cur.right;
    //         }
    //         left = root.val- pre.val;
    //     }

    //     cur = root.right;
    //     pre = root;
    //     if(cur!=null){
    //         while(cur!=null){
    //             pre = cur;
    //             cur = cur.left;
    //         }
    //         right = pre.val-root.val;
    //     }
    //     return Math.min(left, right);
    // }
}
// @lc code=end

