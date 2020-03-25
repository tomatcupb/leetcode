import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // HashSet<ListNode> set = new HashSet<>();
        // while(head != null){
        //     if(set.contains(head)){
        //         return head;
        //     } else{
        //         set.add(head);
        //     }
        //     head = head.next;
        // }
        // return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode p1 = head;
                ListNode p2 = fast;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}
// @lc code=end

