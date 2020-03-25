import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        // if(s.length()<=numRows || numRows==1) return s;
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i<numRows; i++){
        //     printChar(sb, i, numRows, s);
        // }
        // return sb.toString();
        
        if(s.length()<=numRows || numRows==1) return s;
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            rows.add(new StringBuilder());
        }
        boolean goDown = true;
        int curRow = 0;
        for(int i = 0; i<s.length(); i++){
            rows.get(curRow).append(s.charAt(i));
            curRow = goDown?++curRow:--curRow;
            if(curRow==0 || curRow==numRows-1) goDown = !goDown;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: rows){
            res.append(sb);
        }
        return res.toString();
    }

    // private StringBuilder printChar(StringBuilder sb, int level, int numRows, String s){
    //     int step = (numRows-level-1)*2;
    //     int rest = 2*numRows-2-step;
    //     sb.append(s.charAt(level));
    //     for(int i = level+step; i<s.length(); i = i+step){
    //         if(step!=0) sb.append(s.charAt(i));
    //         i += rest;
    //         if(rest != 0 && i<s.length()) sb.append(s.charAt(i));
    //     }
    //     return sb;
    // }
}
// @lc code=end

