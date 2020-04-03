import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=623 lang=java
 *
 * [623] 在二叉树中增加一行
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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode dummyRoot = new TreeNode(v);
            dummyRoot.left = root;
            return dummyRoot;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        loop:
        while(!q.isEmpty()){
            level ++;
            int size = q.size();
            if(level==d-1){
                for(int i = 0; i<size; i++){
                    TreeNode node = q.remove();
                    TreeNode newNodeLeft = new TreeNode(v);
                    TreeNode newNodeRight = new TreeNode(v);
                    newNodeLeft.left = node.left;
                    newNodeRight.right = node.right;
                    node.left = newNodeLeft;
                    node.right = newNodeRight;
                }
                break loop;
            } else{
                for(int i = 0; i<size; i++){
                    TreeNode node = q.remove();
                    if(node.left!=null) q.add(node.left); 
                    if(node.right!=null) q.add(node.right); 
                }
            }
        }
        return root;
    }
}
// @lc code=end

