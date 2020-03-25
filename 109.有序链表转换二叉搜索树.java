import java.util.List;

/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode mid = findMid(head);
        TreeNode root = new TreeNode(mid.val);
        // 当割裂的链表只有一个元素时，此处需要return，否则会一直循环
        if(head == mid) return root;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
    }

    private ListNode findMid(ListNode head){
        if(head == null) return null;
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        // 注意此处fast.next != null && fast.next.next != null会出错
        // 当链表只有两个节点时，head == mid， 会直接return，少了mid.next；
        // 除非将root.right = sortedListToBST(mid.next)移上去，先走mid.next；
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(pre != null){
            pre.next = null;
        }
        return slow;
    }
}
// @lc code=end

