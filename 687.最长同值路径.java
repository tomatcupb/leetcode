import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=687 lang=java
 *
 * [687] 最长同值路径
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
        int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        // if(root == null || (root.left == null && root.right == null)) return 0;
        // int len = maxLen(root);
        // max = len>max? len:max;
        // longestUnivaluePath(root.left);
        // longestUnivaluePath(root.right);
        // return max;


        // if(root == null || (root.left == null && root.right == null)) return 0;
        helperPro(root);
        return max;
    }

    // private int maxLen(TreeNode root){
    //     if(root == null || (root.left == null && root.right == null)) return 0;
    //     int left = (root.left != null && root.left.val==root.val)?helper(root.left, root, 0):0;
    //     int right = (root.right != null && root.right.val==root.val)?helper(root.right, root, 0):0;
    //     return left+right;
    // }


    // 只算一个节点的单边最大值
    // private int helper(TreeNode root, TreeNode pre, int num){
    //     if(root==null || (pre!=null && root.val != pre.val)) return num;
    //     if(pre!=null && root.val == pre.val) num++;
    //     int left = helper(root.left, root, num);
    //     int right = helper(root.right, root, num);
    //     return Math.max(left, right);
    // }


    // 直接一次遍历的过程中，同时计算保留两边之和相加的最大值
    private int helperPro(TreeNode root){
        if(root == null) return 0;
        int left = helperPro(root.left);
        int right = helperPro(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if(root.left!=null && root.val == root.left.val){
            arrowLeft += left + 1;
        }
        if(root.right!=null && root.val == root.right.val){
            arrowRight += right+1;
        }
        max= Math.max(max, arrowRight+arrowLeft);
        return Math.max(arrowLeft, arrowRight);
    }
}
// @lc code=end

