import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // for(int count = 0; count<=nums.length; count++){
        //     backTrack(ans, count, new LinkedList<Integer>(), 0, nums);
        // }
        // return ans;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(new ArrayList<Integer>());
        for(int num : nums){
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            for(List<Integer> list: ans){
                temp.add(new ArrayList<Integer>(list){{add(num);}});
            }
            for(List<Integer> list: temp){
                ans.add(list);
            }
        }
        return ans;
    }

    // private void backTrack(List<List<Integer>> ans, int count, LinkedList<Integer> list, int start, int[] nums){
    //     if(list.size() == count){
    //         ans.add(new LinkedList<Integer>(list));
    //         return;
    //     }
        
    //     for(int i = start; i< nums.length; i++){
    //         list.add(nums[i]);
    //         backTrack(ans, count, list, i+1, nums);
    //         list.removeLast();
    //     }

    // }
}
// @lc code=end

