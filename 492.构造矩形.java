/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        while(area%W != 0){
            W--;
        }
        return new int[]{area/W,W};
    }
}
// @lc code=end

