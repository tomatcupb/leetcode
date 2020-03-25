/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int head = 0;
        int tail = s.length()-1;
        while(head<=tail){
            if(s.charAt(head) == s.charAt(tail)){
                head++;
                tail--;
            } else {
                return isPalindrome(s, head, tail-1) || isPalindrome(s, head+1, tail);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            } else{
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

