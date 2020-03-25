import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // if(root == null){
        //     return res;
        // }
        // if(root.left!= null){
        //     inorderTraversal(root.left);
        // }
        // res.add(root.val);
        // if(root.right!= null){
        //     inorderTraversal(root.right);
        // }
        // return res;

        // if(root == null){
        //     return res;
        // }
        // inorderTraversal(root.left);
        // res.add(root.val);
        // inorderTraversal(root.right);
        // return res;
        
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur!= null || !s.isEmpty()){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
// @lc code=end

