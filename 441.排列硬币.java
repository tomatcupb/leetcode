/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int left = Math.max(0, (int)(Math.sqrt(n)*Math.sqrt(2))-3);
        int right = (int)(Math.sqrt(n)*Math.sqrt(2))+1;
        while(left<=right){
            long mid = (left+right)>>>1;
            long leftSum = ((mid-1)*mid)>>>1;
            long rightSum = ((mid + 1)*mid)>>>1;
            if(leftSum<=n && rightSum>=n){
                return (int)(rightSum==n?mid:mid-1);
            } else if(leftSum<n && rightSum<n){
                left = (int)mid+1;
            } else{
                right = (int)mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

