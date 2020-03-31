import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Arrays.sort(candidates);
        // List<List<Integer>> ans = new ArrayList<>();
        // backtrack(ans, new LinkedList<Integer>(), 0,candidates, target);
        // return ans;

        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new LinkedList<Integer>(), 0,candidates, target, 0);
        return ans;
    }

    // private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int start,int[] candidates, int target){
    //     if(target == 0){
    //         ans.add(new LinkedList<>(list));
    //         return;
    //     }

    //     for(int i = start; i<candidates.length; i++){
    //         if(candidates[i]>target){
    //             break;
    //         }
    //         list.add(candidates[i]);
    //         // target = target - candidates[i]会出错，因为removeLast后，没有更新target。
    //         // 所以最好backtrack方法中的参数一行写进去
    //         backtrack(ans, list, i,candidates, target - candidates[i]);
    //         list.removeLast();
    //     }
    // }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int start,int[] candidates, int target, int sum){
        if(sum == target){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i = start; i< candidates.length; i++){
            if(sum + candidates[i] > target){
                break;
            }
            list.add(candidates[i]);
            backtrack(ans, list, i, candidates, target, sum+candidates[i]);
            list.removeLast();
        }
    }
}
// @lc code=end

