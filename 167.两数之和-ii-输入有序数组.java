/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2]; 
        int i = 0;
        int j = numbers.length-1;

        while(i < j){
            int sum = numbers[i]+numbers[j];
            if(sum<target){
                i = i+1;
            } else if(sum > target){
                j = j-1;
            } else {
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }
        return result;
    }
}
// @lc code=end

