import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        // List<Integer> ans = new ArrayList<>();
        // if(root == null) return ans;
        // Queue<TreeNode> q =  new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int  i = 0; i< size; i++){
        //         TreeNode node = q.remove();
        //         if(i == size-1) ans.add(node.val);
        //         if(node.left!=null) q.add(node.left);
        //         if(node.right!=null) q.add(node.right);
        //     }
        // }
        // return ans;

        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        int maxDepth = -1;
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack= new Stack<>();
        HashMap<Integer, TreeNode> map = new HashMap<>();
        nodeStack.add(root);
        depthStack.add(0);
        while(!nodeStack.isEmpty()){
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if(node!=null){
                maxDepth = Math.max(depth, maxDepth);
            }
            if(!map.containsKey(maxDepth)) map.put(maxDepth, node);
            
            if(node.left != null){
                nodeStack.add(node.left);
                depthStack.add(depth+1);
            }
            if(node.right != null) {
                nodeStack.add(node.right);
                depthStack.add(depth+1);
            }
        }
        for(int i = 0; i <=maxDepth; i++){
            ans.add(map.get(i).val);
        }
        return ans;
    }
}
// @lc code=end

