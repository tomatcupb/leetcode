import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new LinkedList<>(), nums, visited);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int[] nums, boolean[] visited){
        if(list.size()==nums.length){
            ans.add(new LinkedList<>(list));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                backtrack(ans, list, nums, visited);
                list.removeLast();
                visited[i] = false;
            }
        }

    }
}
// @lc code=end
