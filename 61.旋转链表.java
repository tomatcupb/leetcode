import java.util.List;

/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            len ++;
            tail = tail.next;
        }
        k = k%len;
        if(k==0) return head;
        tail.next = head;
        ListNode pre = tail;
        ListNode cur = head;
        for(int i = 0; i<(len-k); i++){
            pre = cur;
            cur = cur.next;
        }
        pre.next = null;
        return cur;
    }
}
// @lc code=end

