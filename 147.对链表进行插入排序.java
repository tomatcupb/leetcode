/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = head;
        ListNode cur = head.next;
        ListNode pre = head;
        ListNode curOrdered;
        ListNode preOrdered;
        while(cur!=null){
            curOrdered = dummyHead.next;
            preOrdered = dummyHead;
            while(curOrdered!=cur && curOrdered.val < cur.val){
                preOrdered = curOrdered;
                curOrdered = curOrdered.next;
            }
            if(curOrdered==cur){
                pre = cur;
                cur = cur.next;
            } else{
                pre.next = cur.next;
                ListNode temp = cur.next;
                preOrdered.next = cur;
                cur.next = curOrdered;
                cur = temp;
            }
        }
        return dummyHead.next;
    }
}
// @lc code=end

