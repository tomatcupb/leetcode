import java.util.HashMap;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    public int rob(TreeNode root) {
        // 1.树形dp
        // int[] ans = dfs(root);
        // return Math.max(ans[0], ans[1]);

        // 2. 树形dp+记忆化搜索
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }

    // 返回一个数组
    // int[0] 表示不偷该节点能获得的最大值
    // int[1] 表示偷该节点能获得的最大值
    // private int[] dfs(TreeNode root){
    //     if(root==null) return new int[2];
    //     int[] left = dfs(root.left);
    //     int[] right = dfs(root.right);
    //     int[] ans = new int[2];
    //     ans[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
    //     ans[1] = root.val + left[0] + right[0];
    //     return ans;
    // }
    
    HashMap<TreeNode, int[]> memo =new HashMap<>();
    private int[] dfs(TreeNode root){
        if(root==null) return new int[2];
        if(memo.get(root)!=null) return memo.get(root);
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int[] ans = new int[2];
        ans[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        ans[1] = root.val + left[0] + right[0];
        memo.put(root, ans);
        return ans;
    }
}
// @lc code=end

