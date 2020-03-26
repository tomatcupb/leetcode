import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root) {
        // if(root == null) return 0;
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // int sum = 0;
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     sum += size;
        //     for(int i = 0; i< size; i++){
        //         TreeNode node = q.poll();
        //         if(node.left != null){
        //             q.add(node.left);
        //         }
        //         if(node.right != null){
        //             q.add(node.right);
        //         }
        //     }
        // }
        // return sum;

        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) +1;
    }
}
// @lc code=end

