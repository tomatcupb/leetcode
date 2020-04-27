import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
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
public class Codec {
// 填满整个二叉树为完全二叉树的做法在最后一个退化成链表的二叉树case超时
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // StringBuilder sb = new StringBuilder();
        // if(root==null) return sb.toString();
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        // loop:
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     int count = 0;
        //     for(int i = 0; i<size; i++){
        //         TreeNode node = q.remove();
        //         sb.append(node.val).append("#");
        //         if(node.val == Integer.MIN_VALUE){
        //             count++;
        //             q.add(new TreeNode(Integer.MIN_VALUE));
        //             q.add(new TreeNode(Integer.MIN_VALUE));
        //         } else{
        //             if(node.left!=null){
        //                 q.add(node.left);
        //             }else{
        //                 q.add(new TreeNode(Integer.MIN_VALUE));
        //             }

        //             if(node.right!=null){
        //                 q.add(node.right);
        //             }else{
        //                 q.add(new TreeNode(Integer.MIN_VALUE));
        //             }
        //         }
        //     }
        //     if(count==size) break loop;
        // }
        // return sb.toString();
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private StringBuilder serializeHelper(TreeNode root, StringBuilder sb){
        if(root==null) return sb.append("null").append("#");
        sb.append(root.val).append("#");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
        return sb;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // String[] nums = data.split("#");
        // if(nums.length==1 && nums[0].equals("")) return null;
        // return construct(nums, 0);

        String[] nums = data.split("#");
        if(nums.length==1 && nums[0].equals("")) return null;
        return deserializeHelper(nums);

    }
    int index = 0;
    private TreeNode  deserializeHelper(String[] nums){
        if(nums[index].equals("null")){
            index ++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(nums[index++]));
        root.left = deserializeHelper(nums);
        root.right = deserializeHelper(nums);
        return root;
    }

    // private TreeNode construct(String[] nums, int index){
    //     TreeNode left = null;
    //     TreeNode right = null;
    //     TreeNode root;
    //     if(2*index+1<nums.length){
    //         left = construct(nums, 2*index+1);
    //     }
    //     if(2*index+2<nums.length){
    //         right = construct(nums, 2*index+2);
    //     }
    //     int val = Integer.parseInt(nums[index]);
    //     if(val==Integer.MIN_VALUE){
    //         return null;
    //     } else{
    //         root = new TreeNode(val);
    //     }
    //     root.left = left;
    //     root.right = right;
    //     return root;
    // }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
// @lc code=end

