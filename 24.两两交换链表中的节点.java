/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode dummyHead = head.next;
        ListNode pre = null;
        ListNode cur = head;
        while(cur.next!=null){
            pre = cur;
            cur = cur.next;
            pre.next = cur.next;
            cur.next = pre;
            cur = pre.next;
            if(pre.next!= null){
                if(pre.next.next == null) break;
                pre.next = pre.next.next;
            } else break;
        }
        return dummyHead;
    }
}
// @lc code=end

