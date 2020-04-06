import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
 * @lc app=leetcode.cn id=863 lang=java
 *
 * [863] 二叉树中所有距离为 K 的结点
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

 /**
  * 这道题实际衍生为了图的遍历
  */
class Solution {
    HashMap<TreeNode, TreeNode> map = new HashMap<>();
    private void findPar(TreeNode root, TreeNode par){
        if(root == null) return;
        map.put(root, par);
        findPar(root.left, root);
        findPar(root.right, root);
    }
    // ArrayList<Integer> ans = new ArrayList<>();
    // HashSet<Integer> set =  new HashSet<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        // findPar(root, null);
        // helper(target, 0, K);
        // return ans;
        // BFS
        findPar(root, null);
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        q.add(target);
        set.add(target.val);
        int dist = 0;
        while(!q.isEmpty()){
            if(dist == K){
                for(TreeNode node: q){
                    ans.add(node.val);
                }
                return ans;
            }
            dist ++;
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode node = q.remove();
                if(node.left != null && !set.contains(node.left.val)){
                    set.add(node.left.val);
                    q.add(node.left);
                }
                if(node.right != null && !set.contains(node.right.val)){
                    set.add(node.right.val);
                    q.add(node.right);
                }
                TreeNode par = map.get(node);
                if(par != null && !set.contains(par.val)){
                    set.add(par.val);
                    q.add(par);
                }
            }
        }
        return ans;
    }

    // DFS
    // private void helper(TreeNode node, int dis, int K){
    //     if(node == null) return;
    //     if(!set.contains(node.val)){
    //         set.add(node.val);
    //         if(dis == K){
    //             ans.add(node.val);
    //             return;
    //         }
    //         helper(node.left, dis+1, K);
    //         helper(node.right, dis+1, K);
    //         helper(map.get(node), dis+1, K);
    //     }
    // }
}
// @lc code=end

