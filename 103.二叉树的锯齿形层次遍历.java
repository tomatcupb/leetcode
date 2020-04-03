import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // if(root == null) return ans;
        // LinkedList<TreeNode> linkedlist = new LinkedList<>();
        // linkedlist.add(root);
        // int level = 0;
        // while(!linkedlist.isEmpty()){
        //     int size = linkedlist.size();
        //     level ++;
        //     List<Integer> temp = new ArrayList<>();
        //     if(level%2==1){
        //         for(int i = 0; i<size; i++){
        //             TreeNode node = linkedlist.removeFirst();
        //             temp.add(node.val);
        //             if(node.left != null) linkedlist.add(node.left);
        //             if(node.right != null) linkedlist.add(node.right);
        //         }
        //     }else{
        //         for(int i = 0; i<size; i++){
        //             TreeNode node = linkedlist.removeLast();
        //             temp.add(node.val);
        //             if(node.right != null) linkedlist.addFirst(node.right);
        //             if(node.left != null) linkedlist.addFirst(node.left);
        //         }
        //     }
        //     ans.add(temp);
        // }
        // return ans;


        /**
         * 这一题体现了不同数据结构在不同条件下的优劣：
         * 1. 一个LinkedList利用addFirst，addLast，removeFirst，removeLast尽管可以实现功能，但是其addLast，removeLast效率低下
         * 2. 两个Stack可以物尽其用，提升效率
         */
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Stack<TreeNode> stackOdd = new Stack<>();
        Stack<TreeNode> stackEven = new Stack<>();
        stackOdd.add(root);
        int level = 0;
        while(!stackOdd.isEmpty() || !stackEven.isEmpty()){
            int size = Math.max(stackOdd.size(), stackEven.size());
            level ++;
            List<Integer> temp = new ArrayList<>();
            if(level%2==1){
                for(int i = 0; i<size; i++){
                    TreeNode node = stackOdd.pop();
                    temp.add(node.val);
                    if(node.left != null) stackEven.add(node.left);
                    if(node.right != null) stackEven.add(node.right);
                }
            }else{
                for(int i = 0; i<size; i++){
                    TreeNode node = stackEven.pop();
                    temp.add(node.val);
                    if(node.right != null) stackOdd.add(node.right);
                    if(node.left != null) stackOdd.add(node.left);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
// @lc code=end

