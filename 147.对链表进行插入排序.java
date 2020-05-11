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
        // 在原先链表中修改，效率较低（35%）
        // if(head==null || head.next == null) return head;
        // ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        // dummyHead.next = head;
        // ListNode cur = head.next;
        // ListNode pre = head;
        // ListNode curOrdered;
        // ListNode preOrdered;
        // while(cur!=null){
        //     curOrdered = dummyHead.next;
        //     preOrdered = dummyHead;
        //     while(curOrdered!=cur && curOrdered.val < cur.val){
        //         preOrdered = curOrdered;
        //         curOrdered = curOrdered.next;
        //     }
        //     if(curOrdered==cur){
        //         pre = cur;
        //         cur = cur.next;
        //     } else{
        //         pre.next = cur.next;
        //         ListNode temp = cur.next;
        //         preOrdered.next = cur;
        //         cur.next = curOrdered;
        //         cur = temp;
        //     }
        // }
        // return dummyHead.next;


        // 效率明显提高（98.6%），这种方法更好理解一些
        // 思路是直接搞一个新的链表头，一个一个拆原来的链表节点再插入新的链表中
        // if(head==null || head.next == null) return head;
        // ListNode dummyHead = new ListNode(-1);
        // dummyHead.next = head;
        // ListNode dummyCur = head;
        // ListNode dummyPre = dummyHead;
        // ListNode cur = head.next;
        // head.next = null;

        // while(cur!=null){
        //     // 这是为了减少在已经排序链表中的搜索次数
        //     if(dummyCur.val>=cur.val){
        //         dummyCur = dummyHead.next;
        //         dummyPre = dummyHead;
        //     }
        //     while(dummyCur!=null && dummyCur.val<cur.val){
        //         dummyPre = dummyCur;
        //         dummyCur = dummyCur.next;
        //     }
        //     ListNode tmp = cur.next;
        //     dummyPre.next = cur;
        //     cur.next = dummyCur;
        //     dummyCur = cur;
        //     cur = tmp;
        // }
        // return dummyHead.next;


        // 一条链表搜索插入（98.6%）
        ListNode dummyHead = new ListNode(-1), dummyPre;
        dummyHead.next = head;
        ListNode cur = head;
        while(cur!=null && cur.next != null){
            if(cur.val<=cur.next.val){
                cur = cur.next;
                continue;
            }

            dummyPre = dummyHead;
            while(dummyPre.next.val<cur.next.val){
                dummyPre = dummyPre.next;
            }

            ListNode tmp = cur.next;
            cur.next = cur.next.next;
            tmp.next = dummyPre.next;
            dummyPre.next = tmp;
        }
        return dummyHead.next;
    }
}
// @lc code=end

