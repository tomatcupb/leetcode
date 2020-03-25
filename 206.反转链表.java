/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        // if(head == null){
        //     return null;
        // }
        // ListNode cur = head;
        // ListNode pre = null;
        // ListNode post = null;
        // while(cur.next != null){
        //     post = cur.next;
        //     cur.next = pre;
        //     pre = cur;
        //     cur = post;
        // }
        // cur.next = pre;
        // return cur;
        


        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
// @lc code=end

