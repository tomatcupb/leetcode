import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序查找树
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
    public TreeNode increasingBST(TreeNode root) {
        // 后序遍历+无脑递归
        // if (root == null) return null;
        // // 左子树缕直
        // TreeNode leftRoot = increasingBST(root.left);
        // // 右子树缕直
        // TreeNode rightRoot = increasingBST(root.right);
        // if (leftRoot != null) {
        //     TreeNode cur = leftRoot;
        //     // 缕直后的左子树的最右节点指向原来的根节点
        //     while (cur != null && cur.right != null) {
        //         cur = cur.right;
        //     }
        //     cur.right = root;
        // }
        // // 根节点左子树置空
        // root.left = null;
        // // 根节点的右节点指向缕直后右子树的根节点
        // root.right = rightRoot;
        // // 左子树不为空返回左子树根节点，否则返回根节点
        // return leftRoot == null ? root : leftRoot;


        // if(root == null) return null;
        // inOrder(root);
        // root = new TreeNode(ans.get(0));
        // TreeNode pre = root;
        // for(int i = 1; i<ans.size(); i++){
        //     TreeNode node = new TreeNode(ans.get(i));
        //     pre.right = node;
        //     pre = node;
        // }
        // return root;

        inOrderPro(root);
        return ans.right;
    }

    // 中序遍历笨办法
    // ArrayList<Integer> ans = new ArrayList<>();
    // private void inOrder(TreeNode root){
    //     if(root == null) return;
    //     inOrder(root.left);
    //     ans.add(root.val);
    //     inOrder(root.right);
    // }

    // 中序遍历改良
    // 改指针而不用创建新的树
    TreeNode ans = new TreeNode(-1);
    TreeNode cur = ans;
    private void inOrderPro(TreeNode root){
        if(root == null) return;
        inOrderPro(root.left);
        root.left = null;
        cur.right = root;
        cur = root;
        inOrderPro(root.right);
    }
}
// @lc code=end

