import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=443 lang=java
 *
 * [443] 压缩字符串
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        if(chars.length<=1) return chars.length;
        // Arrays.sort(chars);
        int cur = 0;
        int startIndex = 0;
        int count = 1;
        for(int i = 0; i< chars.length-1; i++){
            if(chars[i]==chars[i+1]){
                count ++;
            } else{
                startIndex = helper(count, startIndex, cur, chars);
                cur = i+1;
                count = 1;
            }
        }
        startIndex = helper(count, startIndex, cur, chars);
        return startIndex;
    }

    private int helper(int count, int startIndex, int cur, char[] chars){
        chars[startIndex] = chars[cur];
        if(count==1) return ++startIndex;
        String strCount = String.valueOf(count);
        for(int i = 0; i<strCount.length(); i++){
            chars[++startIndex] = strCount.charAt(i);
        }
        return ++startIndex;
    }
}
// @lc code=end

