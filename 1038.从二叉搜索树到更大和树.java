/*
 * @lc app=leetcode.cn id=1038 lang=java
 *
 * [1038] 从二叉搜索树到更大和树
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
    TreeNode pre = null;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return null;
        bstToGst(root.right);
        if(pre != null){
            root.val += pre.val;
        }
        pre = root;
        bstToGst(root.left);
        return root;
    }


    
    // private int sumTree(TreeNode root){
    //     if(root == null) return 0;
    //     sum += root.val;
    //     sumTree(root.left);
    //     sumTree(root.right);
    //     return sum;
    // }
}
// @lc code=end

