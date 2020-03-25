import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length == 0) return ans;
        Arrays.sort(nums);
        for(int size = 0; size<=nums.length; size++){
            backtrack(ans, new LinkedList<Integer>(), size, 0, nums);
        }
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int size, int start, int[] nums){
        if(list.size() == size){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i = start; i<nums.length; ){
            list.add(nums[i]);
            backtrack(ans, list, size, i+1, nums);
            int last = list.removeLast();
            i++;
            while(i<nums.length && nums[i] == last){
                i++;
            }
        }
    }
}
// @lc code=end

