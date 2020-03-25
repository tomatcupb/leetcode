import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        loop:
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                break loop;
            } else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            digits = new int[digits.length+1];
            digits[0] = 1;
        } 
        return digits;
    }
}
// @lc code=end

