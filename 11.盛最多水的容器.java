/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // int max = 0;
        // int area = 0;
        // for(int i = 0; i<height.length-1; i++){
        //     for(int j = i+1; j<height.length; j++){
        //         area = area(i, j, height);
        //         max = area>max?area:max;
        //     }
        // }
        // return max;
        
        int max = 0;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            area = (right-left)*Math.min(height[left], height[right]);
            max = area>max?area:max;
            if(height[left]>height[right]){
                right--;
            } else{
                left++;
            }
        }
        return max;
    }

    // private int area(int i, int j, int[] height){
    //     return (j-i)*(int)(Math.min(height[i], height[j]));
    // }
}
// @lc code=end

