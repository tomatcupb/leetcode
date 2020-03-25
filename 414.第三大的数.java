/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int count = 0;
        boolean flag = true;
        for(int num : nums){
            if(num==Integer.MIN_VALUE && flag){
                count++;
                flag = false;
            }
            if(num>first){
                count++;
                third = second;
                second = first;
                first = num;
            } else if(num>second && num!= first){
                count++;
                third = second;
                second = num;
            } else if(num>third && num != second && num!= first){
                count++;
                third = num;
            }
        }
        if(nums.length<3){
            return first;
        } else{
            return count>=3?third:first;
        }
    }
}
// @lc code=end

