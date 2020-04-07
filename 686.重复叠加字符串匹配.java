/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int max = (B.length()-1)/(A.length())+2;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=max; i++){
            String temp = sb.append(A).toString();
            if(temp.contains(B)) return i;
        }
        return -1;
    }
}
// @lc code=end

