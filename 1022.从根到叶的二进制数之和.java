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
        // if(root == null) return 0;
        // return dfs(root, 0);
        

        // ArrayList<Integer> list = new ArrayList<>();
        // backtrack(root, list, 0);
        // int ans = 0;
        // for(Integer i : list){
        //     ans += i;
        // }
        // return ans;

        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum){
        if(root == null) return 0;
        sum = 2 *sum + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
    }

    // private void backtrack(TreeNode root, ArrayList<Integer> list, int num){
    //     if(root == null) return;
    //     num = num*2+root.val;
    //     if(root.left == null && root.right == null){
    //         list.add(num);
    //         return;
    //     }
    //     backtrack(root.left, list, num);
    //     backtrack(root.right, list, num);
    //     return;
    // }
    

    // private int dfs(TreeNode root, int num){
    //     int sum = 0;
    //     num = num * 2 + root.val;
    //     if(root.left == null && root.right == null) return num;
    //     if(root.left != null) sum = sum+dfs(root.left, num);
    //     if(root.right != null) sum = sum+dfs(root.right, num);
    //     return sum;
    // }
}
// @lc code=end

