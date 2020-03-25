/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        // String str = "";
        // int i = 0;
        // while(i<s.length()){
        //     StringBuilder sb = new StringBuilder();
        //     sb.append(s.charAt(i));
        //     int left = i-1;
        //     int right = i+1;
        //     while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
        //         sb.insert(0, s.charAt(left)).append(s.charAt(left));
        //         left--;
        //         right++;
        //     }
        //     if(sb.length()>str.length()){
        //         str = sb.toString();
        //     }
        //     i++;
        // }
        // i = 0;
        // while(i<s.length()-1){
        //     if(s.charAt(i) == s.charAt(i+1)){
        //         StringBuilder sb = new StringBuilder();
        //         int left = i;
        //         int right = i+1;
        //         while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
        //             sb.insert(0, s.charAt(left)).append(s.charAt(left));
        //             left--;
        //             right++;
        //         }
        //         if(sb.length()>str.length()){
        //             str = sb.toString();
        //         }
        //     }
        //     i++;
        // }
        // return str;
        if(s.length()<=1) return s;
        int start = 0;
        int end = 0;
        for(int i = 0; i<s.length(); i++){
            int len1 = centerExpand(s, i, i);
            int len2 = centerExpand(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end-start+1){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int centerExpand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
// @lc code=end

