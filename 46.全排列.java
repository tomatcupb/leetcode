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
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int[] visited = new int[nums.length];
        backTrack(new LinkedList<>(), nums, ans, visited);
        return ans;
    }

    private void backTrack(LinkedList<Integer> list, int[] nums, List<List<Integer>> ans, int[] visited){
        if(list.size() == nums.length){
            ans.add(new LinkedList<>(list));
            return;
        }
        for(int i = 0; i< nums.length; i++){
            if(visited[i]==1) continue;
            list.add(nums[i]);
            visited[i]=1;
            backTrack(list, nums, ans, visited);
            list.removeLast();
            visited[i] = 0;
        }
    }
}
// @lc code=end
