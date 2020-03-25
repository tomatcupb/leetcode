/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
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
    int sum = 0;
    public int findTilt(TreeNode root) {
        // if(root == null){
        //     return 0;
        // }
        // sum += Math.abs(sumTree(root.left)- sumTree(root.right));
        // findTilt(root.left);
        // findTilt(root.right);
        // return sum;

        sumTree(root);
        return sum;
    }

    private int sumTree(TreeNode root){
        // int sumNode = 0;
        // if(root == null){
        //     return 0;
        // }
        // sumNode = root.val + sumTree(root.left) + sumTree(root.right);
        // return sumNode;

        if(root == null){
            return 0;
        }
        int l = sumTree(root.left);
        int r = sumTree(root.right);
        sum += Math.abs(l-r);
        return l+r+root.val;
    }
}
// @lc code=end

