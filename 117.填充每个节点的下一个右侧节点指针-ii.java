import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=117 lang=java
 *
 * [117] 填充每个节点的下一个右侧节点指针 II
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
        // if(root == null) return null;
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);

        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int i = 0; i< size; i++){
        //         Node node = q.remove();
        //         if(i != size-1){
        //             Node rightNext = q.peek();
        //             node.next = rightNext;
        //         }
        //         if(node.left != null){
        //             q.add(node.left);
        //         }
        //         if(node.right != null){
        //             q.add(node.right);
        //         }
        //     }
        // }
        // return root;
        
        if(root == null) return root;
        if(root.left != null && root.right != null){
            root.left.next = root.right;
        } 
        if(root.left != null && root.right == null){
            root.left.next = getNext(root.next);
        } 
        if(root.right != null){
            root.right.next = getNext(root.next);
        }
        // 注意，因为整体从左往右连，所以此处应该先连右边，再连左边
        connect(root.right);
        connect(root.left);
        return root;
        
    }

    private Node getNext(Node root){
        if(root == null) return null;
        if(root.left != null) return root.left;
        if(root.right != null) return root.right;
        if(root.next != null) return getNext(root.next);
        return null;
    }
}
// @lc code=end

