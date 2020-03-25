import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // String sbS = inOrder(s).toString();
        // String sbT = inOrder(t).toString();
        // return sbS.contains(sbT);
        if(s == null && t==null){
            return true;
        } else if(s == null || t == null){
            return false;
        }
        if(equalTree(s,t)){
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean equalTree(TreeNode s, TreeNode t){
        if(s == null && t==null){
            return true;
        } else if(s == null || t == null){
            return false;
        }
        if(s.val == t.val){
            return equalTree(s.left, t.left) && equalTree(s.right, t.right);
        } else{
            return false;
        }
    }



    // private StringBuilder inOrder(TreeNode root){
    //     StringBuilder sb = new StringBuilder();
    //     if(root == null){
    //         return sb.append("#");
    //     }
    //     StringBuilder sbLeft = inOrder(root.left);
    //     StringBuilder sbRight = inOrder(root.right);
    //     sb.append(root.val);
    //     return sbRight.append(sbLeft).append(sb);
    // }
}
// @lc code=end

