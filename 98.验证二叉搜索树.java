import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
        
        // inOrder(root);
        // for(int i = 0; i<list.size()-1; i++){
        //     if(list.get(i)>=list.get(i+1)) return false;
        // }
        // return true;
    }

    private boolean dfs(TreeNode root, Integer min, Integer max){
        if(root==null) return true;

        Integer val = root.val;
        if(max != null && val>=max) return false;
        if(min != null && val<=min) return false;
        
        return dfs(root.left, min, val) && dfs(root.right, val, max);
    }

    // private void inOrder(TreeNode root){
    //     if(root == null) return;
    //     inOrder(root.left);
    //     list.add(root.val);
    //     inOrder(root.right);
    // }
}
// @lc code=end

