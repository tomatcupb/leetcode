import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<String>();
        }
        List<String> listLeft = binaryTreePaths(root.left);
        List<String> listRight = binaryTreePaths(root.right);
        listLeft.addAll(listRight);
        if(listLeft.size()==0){
            listLeft.add(""+root.val);
        }else{
            for(int i = 0; i<listLeft.size(); i++){
                String s = root.val+"->"+listLeft.get(0);
                listLeft.remove(0);
                listLeft.add(s);
            }
        }
        return listLeft;
    }
}
// @lc code=end

