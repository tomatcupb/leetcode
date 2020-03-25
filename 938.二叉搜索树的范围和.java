/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        if(root.val>=L && root.val<= R){
            sum = sum+root.val;
            rangeSumBST(root.right, L, R);
            rangeSumBST(root.left, L, R);
        } else if(root.val < L){
            rangeSumBST(root.right, L, R);
        } else{
            rangeSumBST(root.left, L, R);
        }
        
        return sum;

        // if (root == null) {
        //     return 0;
        // }
        // if (root.val >= L && root.val <= R) {
        //     return root.val+rangeSumBST(root.left, L, R)+rangeSumBST(root.right, L, R);
        // } else if(root.val < L){
        //     return rangeSumBST(root.right, L, R);
        // } else {
        //     return rangeSumBST(root.left, L, R);
        // }
    }
}
// @lc code=end

