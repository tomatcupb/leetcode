import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        // if(head == null){
        //     return true;
        // }
        // ListNode cur = head;
        // ArrayList<Integer> nodes = new ArrayList<>();
        // while(cur!=null){
        //     nodes.add(cur.val);
        //     cur = cur.next;
        // }
        // int size = nodes.size();
        // for(int i = 0; i<size/2;i++){
        //     if(nodes.get(i) != nodes.get(size-i-1)){
        //         return false;
        //     }
        // }
        // return true;
        
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        ListNode pre = null;
        ListNode post = cur.next;
        while(cur != null){
            cur.next = pre;
            pre = cur;
            cur = post;
            post = post == null? null: post.next;
        }
        cur = head;
        ListNode curNew = pre;
        while(curNew!=null){
            if(cur.val != curNew.val){
                return false;
            } else{
                cur = cur.next;
                curNew = curNew.next;  
            }
        }
        return true;

    }
}
// @lc code=end

