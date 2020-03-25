import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.xml.soap.Node;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        // List<Integer> list = new ArrayList<>();
        // if(root == null){
        //     return list;
        // }
        // list.add(root.val);
        // for(int i = 0; i<root.children.size(); i++){
        //     list.addAll(preorder(root.children.get(i)));
        // }
        // return list;

        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int size = stack.size();
            for(int i = 0; i<size; i++){
                Node node= stack.pop();
                list.add(node.val);
                if(node.children!=null){
                    for(int j = node.children.size()-1; j>=0; j--){
                        stack.add(node.children.get(j));
                    }
                }
            }
        }
        return list;
    }
}
// @lc code=end

