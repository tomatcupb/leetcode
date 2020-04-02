import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        // if(root==null) return true;
        // if(Math.abs(heightTree(root.left)-heightTree(root.right))>1) return false;
        // return isBalanced(root.left) && isBalanced(root.right);


        // if(root==null) return true;
        // if(Math.abs(dfs(root.left,0,0)-dfs(root.right,0,0))>1) return false;
        // return isBalanced(root.left) && isBalanced(root.right);

        // if(root==null) return true;
        // if(Math.abs(dfsHeight(root.left)-dfsHeight(root.right))>1) return false;
        // return isBalanced(root.left) && isBalanced(root.right);

        dfsHeightPro(root);
        return res;
    }

    // private int heightTree(TreeNode root){
    //     if(root==null) return 0;
    //     Queue<TreeNode> q =  new LinkedList<>();
    //     q.add(root);
    //     int height = 0;
    //     while(!q.isEmpty()){
    //         int size = q.size();
    //         height++;
    //         for(int i = 0; i<size; i++){
    //             TreeNode node = q.remove();
    //             if(node.left!=null) q.add(node.left);
    //             if(node.right!=null) q.add(node.right);
    //         }
    //     }
    //     return height;
    // }
    
    // private int dfs(TreeNode root, int height, int maxHeight){
    //     if(root==null) return 0;
    //     height++;
    //     if(root.left == null && root.right == null){
    //         maxHeight = height>maxHeight?height:maxHeight;
    //         return maxHeight;
    //     }
    //     return Math.max(dfs(root.left, 0, maxHeight), dfs(root.right, 0, maxHeight))+1;
    // }


    // private int dfsHeight(TreeNode root){
    //     if(root == null) return 0;
    //     int left = dfsHeight(root.left) + 1;
    //     int right = dfsHeight(root.right) + 1;
    //     return Math.max(left, right);
    // }

    boolean res = true;
    private int dfsHeightPro(TreeNode root){
        if(root==null) return 0;
        int left = dfsHeightPro(root.left)+1;
        int right = dfsHeightPro(root.right)+1;
        if(Math.abs(left-right)>1) res = false;
        return Math.max(left, right);
    }
}
// @lc code=end

