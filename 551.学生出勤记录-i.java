/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                countA++;
                if(countA>1){
                    return false;
                }
                countL = 0;
            } else if(s.charAt(i)=='L'){
               countL++;
               if(countL>2){
                return false;
               }
            } else {
                countL = 0;
            }
        }
        return true;
    }
}
// @lc code=end

