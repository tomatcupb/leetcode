/*
 * @lc app=leetcode.cn id=450 lang=java
 *
 * [450] 删除二叉搜索树中的节点
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        TreeNode dummyRoot = new TreeNode(root.val+1);
        TreeNode cur = root;
        TreeNode pre = dummyRoot;
        dummyRoot.left = cur;

        while(cur!=null){
            if(cur.val == key){
                break;
            }else if(cur.val > key){
                pre = cur;
                cur = cur.left;
            } else{
                pre = cur;
                cur = cur.right;
            }
        }

        if(cur==null) return root;
        //左节点
        if(pre.val > cur.val){
            if(cur.right != null){
                pre.left = cur.right;
                TreeNode temp = pre.left;
                while(temp.left != null){
                    temp = temp.left;
                }
                temp.left = cur.left;
            } else{
                pre.left = cur.left;
            }
        } else{//右节点
            if(cur.right != null){
                pre.right = cur.right;
                TreeNode temp = pre.right;
                while(temp.left != null){
                    temp = temp.left;
                }
                temp.left = cur.left;
            } else{
                pre.right = cur.left;
            }
        }
        return dummyRoot.left;
    }
}
// @lc code=end

