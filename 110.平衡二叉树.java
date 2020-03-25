import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int min = 0;
        int max = 0;
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            if(flag){
                min++;
            }
            max++;
            int size = queue.size();
            for(int i = 0; i<size; i++){
                TreeNode node =queue.remove();
                if(node.left == null || node.right == null){
                    flag = false;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            if(max - min >1){
                System.out.println(max);
                System.out.println(min);
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

