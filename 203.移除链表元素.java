/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        // while(head.val == val){
        //     if(head.next == null){
        //         return null;
        //     } else{
        //         head = head.next;
        //     }
        // }
        // ListNode cur = head;
        // while(cur != null && cur.next != null){
        //     if(cur.next.val == val){
        //         cur.next = cur.next.next;
        //     } else{
        //         cur = cur.next;
        //     }
        // }
        // return head;

        ListNode p = new ListNode(-1);
        p.next = head;
        ListNode cur = p;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return p.next;
    }
}
// @lc code=end

