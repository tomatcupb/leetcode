/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.equals("")) return true;
        int indexS = 0;
        int indexT = 0;
        while(indexS<s.length() && indexT<t.length()){
            if(t.charAt(indexT)==s.charAt(indexS)){
                indexS ++;
            }
            indexT ++;
        }
        return indexS==s.length() && s.charAt(indexS-1)==t.charAt(indexT-1) ? true : false;
    }
}
// @lc code=end

