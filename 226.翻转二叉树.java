import java.util.LinkedList;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {
        // if(root == null){
        //     return null;
        // }
        // TreeNode temp;
        // temp = root.left;
        // root.left = root.right;
        // root.right = temp;
        // invertTree(root.left);
        // invertTree(root.right);
        // return root;

        if(root == null){
            return null;
        }
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.add(root);
        while(queue.size() != 0){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.remove();
                if(node != null){
                    TreeNode temp;
                    temp = node.left;
                    node.left = node.right;
                    node.right = temp;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
}
// @lc code=end

