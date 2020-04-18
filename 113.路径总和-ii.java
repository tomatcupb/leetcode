import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        // List<List<Integer>> list = new ArrayList<List<Integer>>();
        // if(root==null) return list;
        // List<List<Integer>> leftList = pathSum(root.left, sum-root.val);
        // List<List<Integer>> rightList = pathSum(root.right, sum-root.val);
        // if(leftList.size()!=0){
        //     for(List<Integer> l: leftList){
        //         l.add(root.val);
        //         list.add(l);
        //     }
        // }
        // if(rightList.size()!=0){
        //     for(List<Integer> l: rightList){
        //         l.add(root.val);
        //         list.add(l);
        //     }
        // }
        // return list;
        backtrack(root, sum, list);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    private void backtrack(TreeNode root, int sum, List<Integer> list){
        if(root==null) return;
        if(sum==root.val && root.left==null && root.right==null){
            list.add(root.val);
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(root.val);
        backtrack(root.left, sum-root.val, new ArrayList<>(list));
        backtrack(root.right, sum-root.val, new ArrayList<>(list));
    }
}
// @lc code=end

