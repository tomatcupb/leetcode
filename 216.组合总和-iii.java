import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        backtrack(ans, new LinkedList<Integer>(), n, k, 1);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int n, int k, int start){
        if(n == 0 && list.size() == k){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i = start; i<10; i++){
            if(i>n) break;
            list.add(i);
            backtrack(ans, list, n-i, k, i+1);
            list.removeLast();
        }
    }
}
// @lc code=end

