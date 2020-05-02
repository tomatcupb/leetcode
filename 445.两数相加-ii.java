import java.util.Stack;

/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        Stack<Integer> s = new Stack<>();
        
        ListNode cur = l1;
        while(cur!=null){
            stack1.push(cur);
            cur = cur.next;
        }
        cur = l2;
        while(cur!=null){
            stack2.push(cur);
            cur = cur.next;
        }

        int carry = 0, num1, num2, sum;
        ListNode next = null;
        cur = null;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            num1 = stack1.isEmpty()?0:stack1.pop().val;
            num2 = stack2.isEmpty()?0:stack2.pop().val;
            sum = num1 + num2 + carry;
            carry = sum/10;
            cur = new ListNode(sum%10);
            cur.next = next;
            next = cur;
        }
        if(carry!=0){
            cur = new ListNode(carry);
            cur.next = next; 
        }
        return cur;
    }
}
//3@lc3code=end

