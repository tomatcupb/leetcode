/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String result = "";
        // int len = strs.length;
        // if(len==0){
        //     return result;
        // }
        // loop:
        // for(int i = 0; i < strs[0].length(); i++){
        //     for(int j = 0; j < len; j++){
        //         if(strs[j].length() == i || strs[j].charAt(i) != strs[0].charAt(i)){
        //             break loop;
        //         }
        //     }
        //     result += strs[0].charAt(i);
        // }
        // return result;
        if(strs.length == 0 || strs==null){
            return "";
        }
        String result = strs[0];
        for (String str : strs) {
            while(!str.startsWith(result)){
                if(result.length() == 1){
                    return "";
                }
                result = result.substring(0, result.length()-1);
            }
        }
        return result;
    }
}
// @lc code=end

