import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        boolean[] isVisited = new boolean[candidates.length];
        backtrack(ans, new LinkedList<Integer>(), candidates, target, 0, isVisited);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int[] candidates, int target, int start, boolean[] isVisited){
        if(target == 0){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i =start; i< candidates.length; i++){
            if(candidates[i]>target) break;
            if(i>0 && candidates[i]==candidates[i-1] && !isVisited[i-1]) continue;
            list.add(candidates[i]);
            isVisited[i] = true;
            backtrack(ans, list, candidates, target-candidates[i], i+1, isVisited);
            isVisited[i] = false;
            list.removeLast();
        }
    }
}
// @lc code=end

