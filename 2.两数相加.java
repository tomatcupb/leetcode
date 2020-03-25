/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // if (l1 == null) {
        //     return l2;
        // } else if (l2 == null) {
        //     return l1;
        // } else {
        //     ListNode head = new ListNode(-1);
        //     ListNode cur = head;
        //     int moreThanTen = 0;
        //     while (l1 != null && l2 != null) {
        //         if (cur.val == -1) {
        //             cur = new ListNode(l1.val + l2.val);
        //             if (cur.val >= 10) {
        //                 cur.val = cur.val % 10;
        //                 moreThanTen = 1;
        //             }
        //             head = cur;
        //             l1 = l1.next;
        //             l2 = l2.next;
        //         } else {
        //             cur.next = new ListNode(l1.val + l2.val + moreThanTen);
        //             if (cur.next.val >= 10) {
        //                 cur.next.val = cur.next.val % 10;
        //                 moreThanTen = 1;
        //             } else {
        //                 moreThanTen = 0;
        //             }
        //             cur = cur.next;
        //             l1 = l1.next;
        //             l2 = l2.next;
        //         }
        //     }
        //     if (l1 == null && l2 == null && moreThanTen == 1) {
        //         cur.next = new ListNode(1);
        //     }

        //     while (l1 != null) {
        //         cur.next = new ListNode(l1.val + moreThanTen);
        //         if (cur.next.val >= 10) {
        //             cur.next.val = cur.next.val % 10;
        //             moreThanTen = 1;
        //         } else {
        //             moreThanTen = 0;
        //         }
        //         cur = cur.next;
        //         l1 = l1.next;
        //     }

        //     while (l2 != null) {
        //         cur.next = new ListNode(l2.val + moreThanTen);
        //         if (cur.next.val >= 10) {
        //             cur.next.val = cur.next.val % 10;
        //             moreThanTen = 1;
        //         } else {
        //             moreThanTen = 0;
        //         }
        //         cur = cur.next;
        //         l1 = l2.next;
        //     }
        //     return head;
        // }

        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        int x;
        int y;
        int carry=0;
        int sum;
        while(l1 != null || l2 != null){
            x = l1 == null? 0: l1.val;
            y = l2 == null? 0: l2.val;
            sum = (x+y+carry)%10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            carry = (x+y+carry) / 10;
            if(l1 != null) l1=l1.next;
            if(l2 != null) l2=l2.next;
        }
        if(carry == 1){
            cur.next = new ListNode(1);
        }
        return dummyHead.next;
    }
}
// @lc code=end
