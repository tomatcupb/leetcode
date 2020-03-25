import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    // ArrayList<Integer> leftList = new ArrayList<Integer>();
    // ArrayList<Integer> rightList = new ArrayList<Integer>();
    public boolean isSymmetric(TreeNode root) {
        // leftOrder(root);
        // rightOrder(root);
        // System.out.println(leftList);
        // System.out.println(rightList);
        // return listEqual(leftList, rightList);
        return isEqual(root, root);
    }

    private boolean isEqual(TreeNode p1, TreeNode p2){
        if(p1 == null && p2 == null){
            return true;
        }
        if(p1!=null && p2!=null && p1.val == p2.val){
            return isEqual(p1.left, p2.right) && isEqual(p1.right, p2.left);
        } else{
            return false;
        }

    }

    // private boolean listEqual(ArrayList<Integer> l1, ArrayList<Integer> l2){
    //     if(l1.size() != l2.size()){
    //         return false;
    //     }
    //     int len = l1.size();
    //     for(int i = 0; i< len; i++){
    //         if(l1.get(i)!=l2.get(i)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // private void leftOrder(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     leftList.add(root.val);
    //     if(root.left != null){
    //         leftOrder(root.left);
    //     }else if(root.right != null){
    //         leftList.add(null);
    //     }
    //     if(root.right != null){
    //         leftOrder(root.right);
    //     }else if(root.left != null){
    //         leftList.add(null);
    //     }
    // }

    // private void rightOrder(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     rightList.add(root.val);
    //     if(root.right != null){
    //         rightOrder(root.right);
    //     } else if(root.left != null){
    //         rightList.add(null);
    //     }
    //     if(root.left != null){
    //         rightOrder(root.left);
    //     } else if(root.right != null){
    //         rightList.add(null);
    //     }
    // }
}
// @lc code=end

