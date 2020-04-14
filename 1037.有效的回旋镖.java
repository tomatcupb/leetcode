/*
 * @lc app=leetcode.cn id=1037 lang=java
 *
 * [1037] 有效的回旋镖
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        // 不要用除法：int相除还是int; 浮点数相除易出错
        if(points.length!=3) return false;
        if(points[0].length != 2 || points[1].length!= 2 || points[2].length!=2) return false;
        return (points[1][1]-points[0][1])*(points[2][0]-points[0][0])
        !=(points[2][1]-points[0][1])*(points[1][0]-points[0][0]);
    }
}
// @lc code=end

