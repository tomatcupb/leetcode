import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
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
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int value = root.val;
        int min = value;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode node = q.remove();
                if((min == value && node.val != value) || (node.val != value && node.val < min)){
                    min = node.val;
                }
                if(node.left!= null){
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return min == value? -1: min;


        // wrong answer, not solved by recursion
        // if(root.left == null){
        //     return -1;
        // }
        // int minLeft = minInTree(root.left);
        // int minRight = minInTree(root.right);
        // System.out.println(minLeft+","+minRight);
        // if(minLeft != root.val && minRight != root.val){
        //     return Math.min(minLeft, minRight);
        // } else if(minLeft != root.val){
        //     return minLeft;
        // } else if(minRight != root.val){
        //     return minRight;
        // } else{
        //     return -1;
        // }
    }

    // private int minInTree(TreeNode root){
    //     int min= Integer.MAX_VALUE;
    //     int minChild = Integer.MAX_VALUE;
    //     if(root == null){
    //         return -1;
    //     }
    //     if(root.val<min){
    //         min = root.val;
    //     }
    //     if(root.left != null){
    //         minChild = Math.min(minInTree(root.left), minInTree(root.right));
    //     }
    //     return Math.min(min, minChild);
    // }
}
// @lc code=end

