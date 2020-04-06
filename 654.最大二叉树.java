/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int start, int end){
        int maxIndex = findMax(nums, start, end);
        TreeNode leftRoot = null;
        TreeNode rightRoot = null;
        if(start<=maxIndex-1){
            leftRoot = helper(nums, start, maxIndex-1);
        }
        if(maxIndex+1<=end){
            rightRoot = helper(nums, maxIndex+1, end);
        }
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    private int findMax(int[] nums, int start, int end){
        int maxIndex = start;
        for(int i = start; i<=end; i++){
            if(nums[i]> nums[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
// @lc code=end

