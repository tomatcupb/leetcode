/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()<=1) return true;
        char first = word.charAt(0);
        char second = word.charAt(1);
        if((first>='a' && first<='z') || (first>='A' && first<='Z' && second>='a' && second<='z')){
            for(int i = 1; i<word.length(); i++){
                if(!(word.charAt(i)>='a' && word.charAt(i)<='z')){
                    return false;
                }
            }
        } else{
            for(int i = 1; i<word.length(); i++){
                if(!(word.charAt(i)>='A' && word.charAt(i)<='Z')){
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

