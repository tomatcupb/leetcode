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
        // ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        // Arrays.sort(candidates);
        // backtrack(target, new ArrayList<>(), ans, 0, candidates);
        // return ans;

        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(target, new LinkedList<>(), ans, candidates, 0);
        return ans;
    }



    private void backtrack(int residue, LinkedList<Integer> list, ArrayList<List<Integer>> ans, int[] candidates, int start){
        if(residue == 0){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i = start; i<candidates.length; i++){
            if(residue<0) break;
            list.add(candidates[i]);
            backtrack(residue-candidates[i], list, ans, candidates, i);
            list.removeLast();
        }
    }

    // private void backtrack(int target, ArrayList<Integer> list, ArrayList<List<Integer>> ans, int start, int[] candidates){
    //     if(sumList(list)==target){
    //         ans.add(new ArrayList<>(list));
    //         return;
    //     }

    //     for(int i = start; i< candidates.length; i++){
    //         if(sumList(list)>target) break;
    //         list.add(candidates[i]);
    //         backtrack(target, list, ans, i, candidates);
    //         list.remove(list.size()-1);
    //     }
    // }

    // private int sumList(ArrayList<Integer> list){
    //     int sum = 0;
    //     for(int num:list){
    //         sum+=num;
    //     }
    //     return sum;
    // }
}
// @lc code=end

