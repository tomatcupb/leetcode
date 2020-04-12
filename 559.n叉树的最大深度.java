import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N叉树的最大深度
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
    public int maxDepth(Node root) {
        // 1. BFS
        // if(root == null) return 0;
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // int depth = 0;
        // while(!q.isEmpty()){
        //     depth ++;
        //     int size = q.size();
        //     for(int i = 0; i<size; i++){
        //         Node node = q.remove();
        //         int subSize = node.children.size();
        //         for(int j = 0; j<subSize; j++){
        //             q.add(node.children.get(j));
        //         }
        //     }
        // }
        // return depth;
        
        // 2. DFS
        if(root==null) return 0;
        int ans = 0;
        int size = root.children.size();
        for(int i = 0; i<size; i++){
            int subSize = maxDepth(root.children.get(i));
            if(subSize>ans) ans = subSize;
        }
        return ans+1;
    }
}
// @lc code=end

