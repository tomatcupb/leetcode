import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1022 lang=java
 *
 * [1022] 从根到叶的二进制数之和
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
    public int sumRootToLeaf(TreeNode root) {
        if(root == null) return 0;
        return dfs(root, 0);
    }

    // private void backtrack(TreeNode root, List<List<Integer>> ans, LinkedList<Integer> list){
    //     if(root == null) return;
    //     if(root.left == null && root.right == null){
    //         list.add(root.val);
    //         ans.add(new LinkedList<>(list));
    //         list.removeLast();
    //         return;
    //     }
    //     list.add(root.val);
    //     dfs(root.left, list);
    //     dfs(root.right, list);
        
    //     return;
    // }
    

    private int dfs(TreeNode root, int num){
        int sum = 0;
        num = num * 2 + root.val;
        if(root.left == null && root.right == null) return num;
        if(root.left != null) sum = sum+dfs(root.left, num);
        if(root.right != null) sum = sum+dfs(root.right, num);
        return sum;
    }
}
// @lc code=end

