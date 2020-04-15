import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 && inorder.length==0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for(int i = 0; i< inorder.length; i++){
            if(inorder[i]==preorder[0]){
                index = i;
                break;
            }
        }
        int[] preOrderLeft = Arrays.copyOfRange(preorder, 1, 1+index);
        int[] preOrderRight = Arrays.copyOfRange(preorder, 1+index, preorder.length);
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, index);
        int[] inorderRight = Arrays.copyOfRange(inorder, index+1, inorder.length);
        root.left = buildTree(preOrderLeft, inorderLeft);
        root.right = buildTree(preOrderRight, inorderRight);
        return root;
    }
}
// @lc code=end

