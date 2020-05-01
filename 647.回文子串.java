/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        //1. 暴力解法，o(n3)，（12.91%，5.55%）
        // char[] chars = s.toCharArray();
        // int len = chars.length;
        // int ans = 0;
        // for(int i = 0; i<len; i++){
        //     for(int j = i; j<len; j++){
        //         ans = isPalindrome(chars, i, j)?ans+1:ans;
        //     }
        // }
        // return ans;

        // 2. 中心扩展法(96.99%, 5.55%)
        //关键在于移动可能的回文子串的中心
        // 长度为n的字符串中，可能的中心有2n-1（字母本身以及两个字母之间的空）
        char[] chars = s.toCharArray();
        int len = chars.length;

        int ans = 0;
        for(int i = 0; i< 2*len-1; i++){
            int left = i/2;
            int right =  left+i%2;//低级：int right = i%2==0?left:left+1;
            while(left>=0 && right<len && chars[left]==chars[right]){
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }

    // private boolean isPalindrome(char[] chars, int start, int end){
    //     while(start<=end){
    //         if(chars[start]!=chars[end]) return false;
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
}
// @lc code=end

