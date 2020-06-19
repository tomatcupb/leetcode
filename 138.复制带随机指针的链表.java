import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // o(n)时间复杂度，o(n)空间复杂度
        // if(head==null) return null;
        // HashMap<Node, Node> map= new HashMap<>();
        // Node cur = head;
        // while(cur!=null){
        //     Node copy = new Node(cur.val), tmp = cur;
        //     map.put(tmp, copy);
        //     cur = cur.next;
        // }
        
        // cur = head;
        // while(cur!=null){
        //     Node copyCur = map.get(cur);
        //     copyCur.next = map.get(cur.next);
        //     copyCur.random = map.get(cur.random);
        //     cur = cur.next;
        // }
        // Node copyHead = map.get(head);
        // return copyHead;

        // o(n)时间复杂度，o(1)空间复杂度
        // 100%，不适用HashMap效率更高
        if(head==null) return null;
        Node cur = head;
        while(cur!=null){
            Node copy = new Node(cur.val);
            Node tmp = cur.next;
            cur.next = copy;
            copy.next = tmp;
            cur = tmp;
        }

        Node newHead = head.next;
        cur = head;
        while(cur!=null){
            Node copy = cur.next;
            copy.random = cur.random==null?null:cur.random.next;
            cur = copy.next;
        }

        cur = head;
        while(cur!=null){
            Node copy = cur.next;
            cur.next = copy.next;
            copy.next = copy.next==null?null:copy.next.next;
            cur = cur.next;
        }
        return newHead;
    }
}
// @lc code=end

