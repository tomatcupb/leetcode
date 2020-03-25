import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=993 lang=java
 *
 * [993] 二叉树的堂兄弟节点
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
    public boolean isCousins(TreeNode root, int x, int y) {
        // if(root == null) return false;
        // ArrayList<Integer> pre = new ArrayList<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int i = 0; i<size; i++){
        //         TreeNode node = q.remove();
        //         if(node.left != null){
        //             if(node.left.val == x || node.left.val == y){
        //                 pre.add(node.val);
        //             }
        //             q.add(node.left);
        //         }
        //         if(node.right != null){
        //             if(node.right.val == x || node.right.val == y){
        //                 pre.add(node.val);
        //             }
        //             q.add(node.right);
        //         }
        //     }
        //     if(pre.size() == 2){
        //         if(pre.get(0) == pre.get(1)){
        //             return false;
        //         } else {
        //             return true;
        //         }
        //     } else if(pre.size() == 1){
        //         return false;
        //     }
        // }
        // return false;

        dfs(root, null);
        return mapDepth.get(x)==mapDepth.get(y) && mapPar.get(x)!=mapPar.get(y); 
    }
    HashMap<Integer, Integer> mapDepth = new HashMap<>();
    HashMap<Integer, Integer> mapPar = new HashMap<>();
    private void dfs(TreeNode node, TreeNode par){
        if(node == null) return;
        mapDepth.put(node.val, par==null?0:1+mapDepth.get(par.val));
        mapPar.put(node.val, par==null?0:par.val);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}
// @lc code=end

