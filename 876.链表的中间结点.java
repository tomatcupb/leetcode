/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null){
            if(fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            } else {
                slow = slow.next;
                break;
            }
        }
        return slow;
    }
}
// @lc code=end

