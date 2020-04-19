import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        // 1. hashmap，未利用排序特性，效率较低
        // HashMap<Integer, Integer> map = new HashMap();
        // ListNode dummyHead = new ListNode(0);
        // dummyHead.next = head;
        // ListNode cur = head;
        // while(cur!=null){
        //     map.put(cur.val, map.getOrDefault(cur.val, 0)+1);
        //     cur = cur.next;
        // }
        // cur = head;
        // ListNode p = dummyHead;
        // while(cur != null){
        //     while(cur != null && map.get(cur.val)!=1){
        //         cur = cur.next;
        //     }
        //     p.next = cur;
        //     p = cur;
        //     if(cur!=null) cur = cur.next;
        // }
        // return dummyHead.next;
        
        // 2. 双指针，利用了排序特性，效率较高
        // if(head==null || head.next==null) return head;
        // ListNode dummyHead = new ListNode(0);
        // ListNode p = dummyHead;
        // ListNode cur = head;
        // while(cur!=null){
        //     if(cur.next!=null){
        //         if(cur.val != cur.next.val){
        //             p.next = cur;
        //             p = cur;
        //         } else{
        //             while(cur!=null && cur.next != null && cur.val == cur.next.val){
        //                 cur = cur.next;
        //             }
        //         }
        //         cur = cur.next;
        //     } else{
        //         p.next = cur;
        //         p = cur;
        //         cur = cur.next;
        //     }
        // }
        // p.next = null;
        // return dummyHead.next;

        // 优化双指针代码
        if(head==null || head.next==null) return head;
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            if(cur.val != cur.next.val){
                p.next = cur;
                p = cur;
            } else{
                while(cur!=null && cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
            }
            cur = cur.next;
        }
        p.next = cur;
        return dummyHead.next;
    }
}
// @lc code=end

