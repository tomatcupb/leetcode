/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        char[] chars = str.toCharArray();
        for(int i = 0; i<chars.length/2; i++){
            if(chars[i]!=chars[chars.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

