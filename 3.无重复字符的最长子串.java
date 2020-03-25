import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     if(s.length()<=1){
    //         return s.length();
    //     }
    //     int max = 0;
    //     HashSet<Character> chars = new HashSet<>();
    //     loop:
    //     for(int i = 0; i< s.length()-1; i++){
    //         chars.clear();
    //         chars.add(s.charAt(i));
    //         for(int j = i+1; j<s.length(); j++){
    //             if(chars.contains(s.charAt(j))){
    //                 if(j-i>max){
    //                     max = j-i;
    //                 }
    //                 continue loop;
    //             } else{
    //                 chars.add(s.charAt(j));
    //             }
    //         }
    //         if(s.length()-i>max){
    //             max = s.length()-i;
    //         }
    //     }
    //     return max;
        
        HashSet<Character> set = new HashSet<>();
        int i = 0, j =0, max = 0;
        while(i<s.length() && j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return max;

    }
}
// @lc code=end
