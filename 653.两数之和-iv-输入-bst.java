import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);
    }

    HashSet<Integer> set = new HashSet<>();
    private boolean dfs(TreeNode root, int k){
        if(root== null){
            return false;
        }
        set.add(root.val);
        if(set.contains(k-root.val) && k!=2*(root.val)){
            return true;
        }
        return dfs(root.left, k) || dfs(root.right,k);
    }
}
// @lc code=end

