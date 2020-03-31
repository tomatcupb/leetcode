import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] isVisited =  new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new LinkedList<Integer>(), nums, isVisited);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int[] nums, boolean[] isVisited){
        if(list.size() == nums.length){
            ans.add(new LinkedList<>(list));
            return;
        }

        loop:
        for(int i = 0; i<nums.length; i++){
            if(!isVisited[i]){
                // 提前排序数组可以省去每次搜索浪费的时间
                // int former = i - 1;
                // while(former>=0){
                //     if(nums[former] == nums[i] && !isVisited[former]) continue loop;
                //     former --;
                // }
                if(i>0 && nums[i]==nums[i-1] && !isVisited[i-1]) continue loop;
                list.add(nums[i]);
                isVisited[i] = true;
                backtrack(ans, list, nums, isVisited);
                list.removeLast();
                isVisited[i] = false;
            }
        }
    }
}
// @lc code=end

