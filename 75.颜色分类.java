/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        //两个指针p0,p2把区域分成3块
        //cur指针一次遍历
        int p0 = 0;
        int p2 = nums.length-1;
        int cur = 0;
        while(cur<=p2){
            if(nums[cur]==0){
                //换过来的数是0就都++，是1只有cur++
                nums[cur++] = nums[p0];
                nums[p0++] = 0;
            } else if(nums[cur]==2){
                nums[cur] = nums[p2];
                nums[p2--] = 2;
            } else{
                cur ++;
            }
        }
    }
}
// @lc code=end

