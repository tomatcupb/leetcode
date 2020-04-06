import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=655 lang=java
 *
 * [655] 输出二叉树
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
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> ans = new ArrayList<>();
        int m = treeHeight(root);
        int n = (int)Math.pow(2, m)-1;
        String[][] temp = new String[m][n];
        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //         temp[i][j] = "";
        //     }
        // }
        for(String[] str: temp){
            Arrays.fill(str, "");
        }
        dfs(root, 0, n/2, n/2, temp);
        for(int i = 0; i<m; i++){
            ans.add(Arrays.asList(temp[i]));
        }
        return ans;
    }
    private void dfs(TreeNode root, int m, int n, int diff, String[][] temp){
        if(root == null) return;
        diff = diff/2;
        temp[m][n] = String.valueOf(root.val);
        dfs(root.left, m+1, n-diff-1, diff, temp);
        dfs(root.right, m+1, n+diff+1, diff, temp);
    }

    private int treeHeight(TreeNode root){
        if(root == null) return 0;
        return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }

}
// @lc code=end

