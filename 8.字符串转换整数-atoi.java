/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int len = str.length();
        if(len == 0) return 0;
        char head = str.charAt(0);
        if(len == 1) return head>='0' && head<='9'?(int)(head-'0'):0;
        if(head!='+' && head!='-' && (head<'0' || head>'9')) return 0;
        
        boolean neg = head=='-'?true:false;
        long ans = 0L;
        if(head>='0' && head<='9') ans += head-'0';
        for(int i = 1; i<len;i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                ans = 10*ans+(str.charAt(i)-'0');
                if(neg && ans-1>Integer.MAX_VALUE) return Integer.MIN_VALUE;
                if(!neg && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            } else{
                break;
            }
        }
        return (neg?-1:1)*(int)ans;
    }
}
// @lc code=end

