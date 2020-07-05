/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        // 暴力法10%
        int max = 0, len = heights.length;
        for(int i = 0; i<len; i++){
            int j = i+1, tmp = 1;
            while(j<len && heights[j]>=heights[i]){
                tmp ++;
                j++;
            }
            int k = i-1;
            while(k>=0 && heights[k]>=heights[i]){
                tmp ++;
                k--;
            }
            max = Math.max(max, tmp*heights[i]);
        }
        return max;

        // 
    }
}
// @lc code=end

