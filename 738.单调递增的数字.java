/*
 * @lc app=leetcode.cn id=738 lang=java
 *
 * [738] 单调递增的数字
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int N) {
        // if(N<10) return N;
        // int[] nums = new int[String.valueOf(N).length()];
        // int index = nums.length-1;
        // while(N>0){
        //     nums[index--] = N%10;
        //     N = N/10;
        // }
        // index = nums.length;
        // for(int i = nums.length-1; i>0; i--){
        //     if(nums[i]<nums[i-1]){
        //         index = i;
        //         nums[i-1] = nums[i-1]-1;
        //     }
        // }
        // for(int j = index; j<nums.length; j++){
        //     nums[j] = 9;
        // }
        // int sum = 0;
        // for(int i = 0; i<nums.length;i++){
        //     sum = sum*10 + nums[i];
        // }
        // return sum;


        char[] chars = String.valueOf(N).toCharArray();
        int index = chars.length;
        for(int i = chars.length-1; i>0; i--){
            if(chars[i]<chars[i-1]){
                index = i;
                chars[i-1]--;
            }
        }
        for(int j = index; j<chars.length; j++){
            chars[j] = '9';
        }
        return Integer.parseInt(new String(chars));
    }
}
// @lc code=end

