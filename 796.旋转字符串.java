/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String A, String B) {
        // if(A.length()!=B.length()) return false;
        // if(A.equals(B)) return true;
        // int i = 0;
        // while(!A.equals(B) && i < A.length()){
        //     A = leftMove(A);
        //     i++;
        // }
        // return i==A.length()?false:true;
        return A.length() == B.length()?((A+A).contains(B)):false;
    }

    // private String leftMove(String s){
    //     if(s=="") return s;
    //     char c = s.charAt(0);
    //     StringBuilder sb = new StringBuilder();
    //     for(int i = 1; i< s.length(); i++){
    //         sb.append(s.charAt(i));
    //     }
    //     sb.append(c);
    //     return sb.toString();
    // }
}
// @lc code=end

