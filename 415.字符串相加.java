/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<len; i++){
            int x = i<num1.length()?num1.charAt(num1.length()-i-1)-'0':0;
            int y = i<num2.length()?num2.charAt(num2.length()-i-1)-'0':0;
            int sum = x+y+carry;
            carry = sum/10;
            sb.append(String.valueOf(sum%10));
        }
        if(carry==1){
            sb.append(String.valueOf(1));
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

