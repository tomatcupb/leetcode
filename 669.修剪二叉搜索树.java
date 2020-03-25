/*
 * @lc app=leetcode.cn id=669 lang=java
 *
 * [669] 修剪二叉搜索树
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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        // if(root == null){
        //     return null;
        // }
        // if(root.val>R){
        //     root = trimBST(root.left, L, R);
        // } else if(root.val < L){
        //     root = trimBST(root.right, L, R);
        // } else if(root.val == L){
        //     root.left = null;
        //     root.right = trimBST(root.right, L, R);
        // }else if(root.val == R){
        //     root.right = null;
        //     root.left = trimBST(root.left, L, R);
        // }else if(root.val>L && root.val<R){
        //     root.left = trimBST(root.left, L, R);
        //     root.right = trimBST(root.right, L, R);
        // }
        // return root;
        if(root==null) return root;
        if(root.val>R) return trimBST(root.left, L, R);
        if(root.val<L) return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
// @lc code=end

