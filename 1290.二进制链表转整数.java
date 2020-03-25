/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode cur = head;
        while(cur != null){
            res = res*2 + cur.val;
            cur = cur.next;
        }
        return res;
    }
}
// @lc code=end

