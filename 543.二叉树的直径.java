import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int dep = DFS(root);
        if(dep>max){
            max = dep;
        }
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;
    }

    private int DFS(TreeNode root){
        if(root==null){
            return 0;
        }
        return BFS(root.left)+BFS(root.right)+2;
    }

    private int BFS(TreeNode root){
        if(root == null){
            return -1;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            depth++;
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode node = q.remove();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return depth-1;
    }
}
// @lc code=end

