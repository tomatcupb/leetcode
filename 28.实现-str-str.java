/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int lenHay = haystack.length();
        int lenNee = needle.length();

        if(lenHay<lenNee){
            return -1;
        } else if(lenNee==0){
            return 0;
        }

        char[] arrHaystack = haystack.toCharArray();
        char[] arrNeedle = needle.toCharArray();
        char firstNeedle = arrNeedle[0];

        for(int i=0; i< lenHay-lenNee+1; i++){
            if(arrHaystack[i]==firstNeedle){
                String subHay = haystack.substring(i,i+lenNee);
                if(subHay.equals(needle)){
                    return i;
                }
            }
        }
        return -1;

        // return haystack.indexOf(needle);
    }
}
// @lc code=end

