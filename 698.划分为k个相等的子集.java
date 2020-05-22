import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=698 lang=java
 *
 * [698] 划分为k个相等的子集
 */

// @lc code=start
class Solution {
    int target;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 双重暴力回溯，效率较低33.92%， 9.09%
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum%k!=0) return false;
        target = sum/k;

        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, 0, new LinkedList<Integer>(), ans);
        if(ans.size() < k) return false;

        backtrack2(ans, 0, 0, k, new LinkedList<List<Integer>>());
        return flag;
    }

    private void backtrack(int[] nums, int start, int num, LinkedList<Integer> list, List<List<Integer>> ans){
        if(num == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(num>target) return;
        for(int i = start; i< nums.length; i++){
            list.add(i);
            backtrack(nums, i+1, num+nums[i], list, ans);
            list.removeLast();
        }
    }
    boolean flag;
    private void backtrack2(List<List<Integer>> ans, int count, int start, int k, LinkedList<List<Integer>> list){
        if(count==k) {
            flag = true;
            return;
        }
        if(!flag){
            for(int i = start; i< ans.size(); i++){
                if(isConflicted(list, ans.get(i))) continue;
                list.add(ans.get(i));
                backtrack2(ans, count+1, i+1, k, list);
                list.removeLast();
            }
        }
    }

    private boolean isConflicted(LinkedList<List<Integer>> list1, List<Integer> list2){
        HashSet<Integer> set = new HashSet<>();
        for(List<Integer> inner: list1){
            for(int i: inner){
                set.add(i);
            }
        }
        for(int i:list2){
            if(!set.add(i)) return true;
        }
        return false;
    }
}
// @lc code=end

