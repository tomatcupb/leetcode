/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
    //     if(s.length()<=1) return false;
    //     char start = s.charAt(0);
    //     for(int i = 1; i<=s.length()/2; i++){
    //         if(s.charAt(i)==start){
    //             int len = i;
    //             if(s.length()%len!=0) continue;
    //             loop:
    //             for(int j = 1; j<s.length()/len; j++){
    //                 int cur = 0;
    //                 for(int k = len*j; k<len*(j+1); k++){
    //                     if(s.charAt(k)!=s.charAt(cur)) break loop;
    //                     cur++;
    //                 }
    //                 if(j==s.length()/len-1) return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    String str = s + s;
    return str.substring(1, str.length() - 1).contains(s);
    }
}
// @lc code=end

