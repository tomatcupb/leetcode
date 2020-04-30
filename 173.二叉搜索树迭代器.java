import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {
    // 利用queue空间复杂度是o(n)，n是节点个数
    // Queue<Integer> q;
    // public BSTIterator(TreeNode root) {
    //     q =  new LinkedList<>();
    //     inOrder(root);
    // }

    // private void inOrder(TreeNode root){
    //     if(root==null) return;
    //     inOrder(root.left);
    //     q.add(root.val);
    //     inOrder(root.right);
    // }
    
    // /** @return the next smallest number */
    // public int next() {
    //     return q.remove();
    // }
    
    // /** @return whether we have a next smallest number */
    // public boolean hasNext() {
    //     return !q.isEmpty();
    // }


    //利用stack，空间复杂度o(h)
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack =  new Stack<>();
        TreeNode cur = root;

        while(cur!= null){
            stack.push(cur);
            cur = cur.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int ans = node.val;
        node = node.right;
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
        return ans;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

