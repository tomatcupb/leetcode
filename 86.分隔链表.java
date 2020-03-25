/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        ListNode curMin = new ListNode(0);
        ListNode dummyHeadMin = curMin;
        ListNode curMax = new ListNode(0);
        ListNode dummyHeadMax = curMax;

        while(head != null){
            if(head.val < x){
                curMin.next = head;
                curMin = curMin.next;
            } else{
                curMax.next = head;
                curMax = curMax.next;
            }
            head = head.next;
        }
        curMax.next = null;
        curMin.next = dummyHeadMax.next;
        return dummyHeadMin.next;
    }
}
// @lc code=end

