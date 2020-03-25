import java.util.List;

/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        if(head == null) return;
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode cur1 = head;
        ListNode cur2 = reverse(mid.next);

        mid.next = null;
        while(cur1 != null && cur2 != null){
            ListNode next1 = cur1.next;
            ListNode next2 = cur2.next;
            cur1.next = cur2;
            cur2.next = next1;
            cur1 = next1;
            cur2 = next2;
        }
        // ListNode mid = slow;
        // ListNode cur = head;
        // ListNode preLast = null;
        // ListNode last = null;
        // ListNode next = null;
        // while(cur != mid){
        //     preLast = lastPre(mid);
        //     last = preLast.next;
        //     preLast.next = null;
        //     next = cur.next;
        //     cur.next = last;
        //     last.next = next;
        //     cur = next;
        // }
    }

    // private ListNode lastPre(ListNode node){
    //     ListNode pre = null;
    //     while(node.next != null){
    //         pre = node;
    //         node = node.next;
    //     }
    //     return pre;
    // }

    private ListNode reverse(ListNode node){
        ListNode pre = null;
        ListNode cur = node;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
// @lc code=end

