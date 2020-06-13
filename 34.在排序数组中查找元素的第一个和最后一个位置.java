import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] ans = new int[]{-1,-1};
        // int leftIndex = findBoundary(nums, target, true);
        // if(leftIndex == nums.length || nums[leftIndex]!=target) return ans;

        // ans[0] = leftIndex;
        // ans[1] = findBoundary(nums, target, false)-1;

        // return ans;
        int[] ans = new int[]{-1,-1};
        int len = nums.length;
        if(len==0) return ans;
        int left = 0, right = len-1;
        // 这种写法不会碰到死循环
        // 原因是
        // 如果mid恰好是目标，right前移到目标的前一个位置
        // 但是此后right不会在移动，而是left一直移动（即走else的逻辑），直到与right重合
        // 此时left==right==mid,left=mid+1,即走到了目标位置
        // left>right，返回left即可
        while(left<=right){
            int mid = (left+right)>>>1;
            if(nums[mid]<target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        // 这里注意找不到的话退出的条件！！
        if(left<0 || left == len || nums[left]!=target){
            return ans;
        } else{
            ans[0] = left;
        }

        left = 0; right = len-1;
        while(left<=right){
            int mid = (left+right)>>>1;
            if(nums[mid]<=target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        ans[1] = right;
        return ans;

    }

    // private int findBoundary(int[] nums, int target, boolean leftRange){
    //     int left = 0;
    //     int right = nums.length;
    //     while(left < right){
    //         int mid = (left+right) >>> 1;
    //         if(nums[mid]>target || (leftRange && nums[mid]==target)){
    //             right = mid;
    //         } else {
    //             left = mid+1;
    //         }
    //     }
    //     return left;
    // }
}
// @lc code=end

