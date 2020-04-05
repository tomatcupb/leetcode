/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        int pre = Integer.MIN_VALUE/2;
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i)==C) pre = i;
            ans[i] = i-pre;
        }
        pre = Integer.MAX_VALUE/2;
        for(int i = S.length()-1; i>-1; i--){
            if(S.charAt(i)==C) pre = i;
            ans[i] = Math.min(ans[i], pre-i);
        }
        return ans;
    }
}
// @lc code=end

