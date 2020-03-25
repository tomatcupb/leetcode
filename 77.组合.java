import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new LinkedList<Integer>(), ans, k, n, 1);
        return ans;
    }

    private void backtrack(LinkedList<Integer> cur, List<List<Integer>> ans ,int k, int n, int start){
        if(cur.size() == k){
            ans.add(new LinkedList<Integer>(cur));
            return;
        }

        for(int i = start; i<=n; i++){
            cur.add(i);
            //找出以start开头的所有结果
            backtrack(cur, ans, k, n, i+1);
            cur.removeLast();
        }
    }
  }
// @lc code=end

