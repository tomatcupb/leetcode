/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    int rank = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root.left != null){
            kthSmallest(root.left, k);
        }
        rank++;
        if(rank==k){
            ans = root.val;
        } else if(root.right != null){
            kthSmallest(root.right, k);
        }
        return ans;
    }
}
// @lc code=end

