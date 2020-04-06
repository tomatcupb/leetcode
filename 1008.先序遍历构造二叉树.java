/*
 * @lc app=leetcode.cn id=1008 lang=java
 *
 * [1008] 先序遍历构造二叉树
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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = helper(preorder, 0, preorder.length-1);
        return root;
    }

    private TreeNode helper(int[] preorder, int start, int end){
        if(start>end) return null;
        if(start == end) return new TreeNode(preorder[start]);
        TreeNode root = new TreeNode(preorder[start]);
        int p = end+1;
        for(int i = start; i<=end; i++){
            if(preorder[i]>preorder[start]){
                p = i;
                break;
            }
        }
        root.left = helper(preorder, start+1, p-1);
        root.right = helper(preorder, p, end);
        return root;
    }
}
// @lc code=end

