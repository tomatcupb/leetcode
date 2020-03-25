/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第N个节点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head == null) return null;
        // ListNode dummyHead = new ListNode(0);
        // dummyHead.next = head;
        // ListNode cur = head;
        // int len = 0;
        // while(cur != null){
        //     len ++;
        //     cur = cur.next;
        // }
        
        // cur = head;
        // ListNode pre = dummyHead;
        // int p = len - n;
        // int count = 0;
        // while(count != p){
        //     pre = cur;
        //     cur = cur.next;
        //     count++;
        // }
        // pre.next = cur.next;
        // return dummyHead.next;

        if(head == null) return null;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode fast = head;
        for(int i = 1; i<n; i++){
            fast = fast.next;
        }
        ListNode pre = dummyHead;
        ListNode slow = head;
        while(fast.next!=null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = slow.next;
        return dummyHead.next;
    }
}
// @lc code=end

