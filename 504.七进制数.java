/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int n = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.insert(0, String.valueOf(n%7));
            n = n/7;
        }
        return num<0?sb.insert(0, "-").toString():sb.toString();
    }
}
// @lc code=end

