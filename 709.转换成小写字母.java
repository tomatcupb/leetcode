/*
 * @lc app=leetcode.cn id=709 lang=java
 *
 * [709] 转换成小写字母
 */

// @lc code=start
class Solution {
    public String toLowerCase(String str) {
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str = new StringBuilder(str).replace(i, i+1, String.valueOf((char)(str.charAt(i)-'A'+'a'))).toString();
            }
        }
        return str;
    }
}
// @lc code=end

