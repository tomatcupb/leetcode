import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        // int sum = 0;
        // if(root == null){
        //     return sum;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i = 0; i< size; i++){
        //         TreeNode node = queue.remove();
        //         if(node.left != null){
        //             if(node.left.left == null && node.left.right == null){
        //                 sum = sum + node.left.val;
        //             } else{
        //                 queue.add(node.left);
        //             }
        //         }
        //         if(node.right != null){
        //             queue.add(node.right);
        //         }
        //     }
        // }
        // return sum;
        
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if(root.left!= null && root.left.left == null && root.left.right == null){
            sum = sum + root.left.val;
            return sumOfLeftLeaves(root.right)+sum;
        } else{
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+sum;
        }

    }
}
// @lc code=end

