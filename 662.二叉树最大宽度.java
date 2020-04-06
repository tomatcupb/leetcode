import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
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
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 1, 1);
        return MaxW;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int MaxW = 0;
    private void dfs(TreeNode root, int level, int index){
        if(root == null) return;
        if(!map.containsKey(level)){
            map.put(level, index);
        }
        MaxW = Math.max(MaxW, index - map.get(level) + 1);
        dfs(root.left, level+1, 2*index-1);
        dfs(root.right, level+1, 2*index);
    }
}
// @lc code=end

