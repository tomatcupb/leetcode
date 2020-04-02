import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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
    int maxLevel = 0;
    int mostLeft = -1;
    public int findBottomLeftValue(TreeNode root) {
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // int mostLeft = -1;
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int i = 0; i<size; i++){
        //         TreeNode node = q.remove();
        //         if(i==0) mostLeft = node.val;
        //         if(node.left!=null) q.add(node.left);
        //         if(node.right!=null) q.add(node.right);
        //     }
        // }
        // return mostLeft;

        dfs(root, 0);
        return mostLeft;
    }

    private void dfs(TreeNode root, int level){
        if(root == null) return;
        level++;
        if(level>maxLevel){
            maxLevel = level;
            mostLeft = root.val;
        }
        dfs(root.left, level);
        dfs(root.right, level);
    }
}
// @lc code=end

