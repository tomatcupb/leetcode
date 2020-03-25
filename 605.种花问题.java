/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        int res = 0;
        for(int i = 0; i<flowerbed.length; i++){
            if(flowerbed[i]==0){
                count ++;
                if(i==flowerbed.length-1){
                    res += (count+2)/2-1;
                }
            } else{
                res += (count+1)/2-1;
                count = 0;
            }
        }
        return res>=n;
    }
}
// @lc code=end

