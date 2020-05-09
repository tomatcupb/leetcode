/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    // 这道题有一个很关键的点，就是只有两个节点的时候要确保通过快慢指针能够打断链表！
    public ListNode sortList(ListNode head) {
        // 快排的效率较低（8.65%，5.88%）
        // if(head==null || head.next == null) return head;
        // ListNode dummyHead =  new ListNode(-1);
        // dummyHead.next = head;
        // return quickSort(dummyHead, null);

        // 归并效率提高明显（72.4%，5.88%）
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head){
        if(head== null || head.next == null) return head;
        ListNode slow = head;
        // 此处需要注意，fast要和slow不相等，否则两个节点的时候递归出不来！！！
        ListNode fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = mergeSort(slow.next);
        slow.next = null;//把链表以slow节点拆开！！
        ListNode left = mergeSort(head);

        // ListNode fast = head, slow = head, pre = null;
        // while (fast != null && fast.next != null) {
        //     pre = slow;
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // 打断链表！
        // pre.next = null;
        // ListNode left = mergeSort(head);
        // ListNode right = mergeSort(slow);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while(left!=null && right!=null){
            if(left.val<right.val){
                cur.next = left;
                left = left.next;
            } else{
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        // 链表不需要这么写！！
        // while(left!=null){
        //     dummyHead.next = left;
        //     left = left.next;
        // }
        // while(right!=null){
        //     dummyHead.next = right;
        //     right = right.next;
        // }
        cur.next = left == null? right:left;
        return dummyHead.next;
    }


    // head = dummyHead,tail = null
    // private ListNode quickSort(ListNode head, ListNode tail){
    //     if(head==null || head.next == tail || head.next.next == tail) return head;
    //     ListNode smallHead = new ListNode(-1);
    //     ListNode pivot = head.next;
    //     ListNode cur = pivot;
    //     ListNode smallCur = smallHead;
        
    //     while(cur!= null && cur.next != tail){
    //         if(cur.next.val<pivot.val){
    //             smallCur.next = cur.next;
    //             smallCur = smallCur.next;
    //             cur.next = cur.next.next;
    //         } else{
    //             cur = cur.next;
    //         }
    //     }
    //     smallCur.next = pivot;
    //     // 这一步是让dummyHead再次指向排序之后的头结点！！
    //     // 保证链表每一次都是连上的
    //     head.next=smallHead.next;

    //     quickSort(head, pivot);
    //     quickSort(pivot, tail);
    //     return head.next;
    // }
}
// @lc code=end

