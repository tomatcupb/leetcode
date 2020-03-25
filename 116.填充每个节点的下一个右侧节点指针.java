import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                Node node = q.remove();
                if(i!=size-1){
                    Node rightNext = q.peek();
                    node.next = rightNext;
                }
                if(node.left != null){
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
    return root;
    }
}
// @lc code=end

