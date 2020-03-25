import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] res = new int[list.size()];
        if(!list.isEmpty()){
            for(int i = 0; i< list.size(); i++){
                res[i] = list.get(i);
            }
        } 
        return res;
    }


    ArrayList<Integer> list = new ArrayList<>();
    TreeNode pre = null;
    int thisTimes = 0;
    int max = 0;
    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        if(pre != null && pre.val == root.val){
            thisTimes++;
        } else{
            thisTimes = 1;
        }
        if(thisTimes==max){
            list.add(root.val);
        } else if(thisTimes>max){
            max = thisTimes;
            list.clear();
            list.add(root.val);
        }
        pre = root;
        inOrder(root.right);
    }
}
// @lc code=end

