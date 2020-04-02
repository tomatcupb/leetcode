import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
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
    public List<Integer> largestValues(TreeNode root) {
        // List<Integer> ans = new ArrayList<>();
        // if(root == null) return ans;
        // Queue<TreeNode> q = new LinkedList<>(); 
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     int max = Integer.MIN_VALUE;
        //     for(int i = 0; i<size; i++){
        //         TreeNode node = q.remove();
        //         if(node.val>max) max = node.val;
        //         if(node.left != null) q.add(node.left);
        //         if(node.right != null) q.add(node.right);
        //     }
        //     ans.add(max);
        // }
        // return ans;

        List<Integer> ans = new ArrayList<>();
        dfs(root, 0);
        for(int i = 1; i<=maxLevel; i++){
            ans.add(map.get(i));
        }
        return ans;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    int maxLevel = 0;
    private void dfs(TreeNode root, int level){
        if(root == null) return;
        level++;
        if(level>maxLevel) maxLevel = level;
        if(map.containsKey(level)){
            map.put(level, Math.max(root.val, map.get(level)));
        } else{
            map.put(level, root.val);
        }
        dfs(root.left, level);
        dfs(root.right, level);
    }
}
// @lc code=end

