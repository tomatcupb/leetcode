import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);

        // ArrayList<Integer> list = new ArrayList<>();
        // backtrack(root, list, 0);
        // int ans = 0;
        // for(Integer i:list){
        //     ans+=i;
        // }
        // return ans;
    }

    private int helper(TreeNode root, int sum){
        if (root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) {
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
    }


    // private void backtrack(TreeNode root, ArrayList<Integer> list, int num){
    //     if(root == null) return;
    //     num = 10*num + root.val;
    //     if(root.left == null && root.right == null){
    //         list.add(num);
    //         return;
    //     }
    //     backtrack(root.left, list, num);
    //     backtrack(root.right, list, num);
    // }
}
// @lc code=end

