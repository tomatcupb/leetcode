import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        //遍历节点
        // if(root == null){
        //     return 0;
        // }
        // int level = 0;
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // queue.add(root);
        // loop:
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     level++;
        //     for(int i = 0; i<size; i++){
        //         TreeNode node = queue.remove();
        //         if(node.left == null && node.right == null){
        //             break loop;
        //         }
        //         if(node.left != null){
        //             queue.add(node.left);
        //         } 
        //         if(node.right != null){
        //             queue.add(node.right);
        //         }
        //     }
        // }
        // return level;

        //递归
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right)+1;
        }
        if(root.right == null && root.left != null){
            return minDepth(root.left)+1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right))+1; 
    }
}
// @lc code=end

