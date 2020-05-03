import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list =  new ArrayList<>();
            for(int i = 0; i< size; i++){
                Node node = q.remove();
                list.add(node.val);
                List<Node> kids = node.children;
                if(kids!=null){
                    for(Node kid:kids){
                        q.add(kid);
                    }
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
// @lc code=end

