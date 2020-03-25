/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        // if(root == null){
        //     return Integer.MAX_VALUE;
        // }
        // int res = getMin(root);
        // min = res<min?res:min;
        // getMinimumDifference(root.left);
        // getMinimumDifference(root.right);
        // return min;
        inOrder(root);
        return min;
    }

    TreeNode pre = null;
    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        if(pre != null){
            min = root.val - pre.val < min? root.val - pre.val : min;
        } 
        pre = root;
        inOrder(root.right);
    }

    // private int getMin(TreeNode root){
    //     int minLeft = Integer.MAX_VALUE;
    //     int minRight = Integer.MAX_VALUE;
    //     if(root == null){
    //         return Integer.MAX_VALUE;
    //     }
    //     TreeNode cur = root;
    //     if(cur.left!=null){
    //         cur = cur.left;
    //         while(cur.right!=null){
    //             cur = cur.right;
    //         }
    //         minLeft = root.val - cur.val;
    //     }
    //     cur = root;
    //     if(cur.right!=null){
    //         cur = cur.right;
    //         while(cur.left!=null){
    //             cur = cur.left;
    //         }
    //         minRight = cur.val - root.val;
    //     }
    //     return Math.min(minLeft, minRight);
    // }
}
// @lc code=end

