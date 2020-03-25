/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n || head.next == null) return head;
        ListNode dummyHead =  new ListNode(0);
        dummyHead.next = head;
        int count = 1;
        ListNode pre = dummyHead;
        ListNode cur = head;
        while(count<m){
            pre = cur;
            cur = cur.next;
            count++;
        }
        ListNode first = pre;
        ListNode second = cur;
        ListNode next = null;
        while(count<=n){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;
        }
        first.next = pre;
        second.next = cur;
        return dummyHead.next;

    }
}
// @lc code=end

