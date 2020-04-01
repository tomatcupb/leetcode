import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 1; i<= nums.length; i++){
            //此处注意索引变换
            nums[Math.abs(nums[i-1])-1] = - Math.abs(nums[Math.abs(nums[i-1])-1]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<= nums.length; i++){
            if(nums[i-1]>0) ans.add(i);
        }
        return ans;
    }
}
// @lc code=end

