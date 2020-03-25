/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
        // if(root == null) return;
        // TreeNode cur = root;
        // if(cur.left != null){
        //     TreeNode temp = cur.right;
        //     cur.right = cur.left;
        //     cur.left = null;
        //     while(cur.right != null){
        //         cur = cur.right;
        //     }
        //     cur.right = temp;
        // }
        // flatten(root.right);

        if(root == null) return; //结束条件
        flatten(root.left);//不管递归的细节，知道这个递归是把左树捋直即可
        flatten(root.right);//不管递归的细节，知道这个递归是把右树捋直即可
        TreeNode temp = root.right;//以下是把两棵树接起来
        root.right = root.left;
        root.left = null;
        TreeNode cur = root;
        while(cur.right!=null){
            cur = cur.right;
        }
        cur.right = temp;
    }
}
// @lc code=end

