import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=508 lang=java
 *
 * [508] 出现次数最多的子树元素和
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
    
    public int[] findFrequentTreeSum(TreeNode root) {
        // helper(root);
        // int max = 0;
        // for(Integer i:map.values()){
        //     if(i>max) max = i;
        // }
        // int count = 0;
        // for(Integer i:map.values()){
        //     if(i==max) count++;
        // }
        // int[] ans = new int[count];
        // int index = 0;
        // for(Integer i:map.keySet()){
        //     if(map.get(i)==max) ans[index++]=i;
        // }
        // return ans;
        
        if(root == null) return new int[0];
        dfsPro(root);
        int count = 0;
        for (Integer i : map.values()) {
            if (i == max) count++;
        }
        int[] ans = new int[count];
        int index = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) == max) ans[index++] = i;
        }
        return ans;
    }

    // private void helper(TreeNode root){
    //     if(root == null) return;
    //     int sum = dfs(root);
    //     map.put(sum, map.getOrDefault(sum, 0)+1);
    //     helper(root.left);
    //     helper(root.right);
    // }

    // private int dfs(TreeNode root){
    //     if(root == null) return 0;
    //     int leftSum = dfs(root.left);
    //     int rightSum = dfs(root.right);
    //     return leftSum+rightSum+root.val;
    // }


    // 一次遍历求出目标map和max
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;
    private int dfsPro(TreeNode root){
        if(root == null) return 0;
        int leftSum = dfsPro(root.left);
        int rightSum = dfsPro(root.right);
        int val = leftSum+rightSum+root.val;
        map.put(val, map.getOrDefault(val, 0)+1);
        max = Math.max(max, map.get(val));
        return val;
    }
}
// @lc code=end

