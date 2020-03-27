/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // int[] ans = new int[]{-1,-1};
        // int left = 0;
        // int right = nums.length-1;
        // while(left<=right){
        //     int mid = (left+right) >>> 1;
        //     if(nums[mid] > target){
        //         right = mid - 1;
        //     } else if(nums[mid] <target){
        //         left = mid +1;
        //     } else{
        //         if(mid == 0){
        //             ans[0] = 0;
        //             break;
        //         } else if (nums[mid-1] == target){
        //             right = mid - 1;
        //         } else{
        //             ans[0] = mid;
        //             break;
        //         }
        //     }
        // }

        // //简单优化，缩小区间
        // left = ans[0];
        // right = nums.length-1;
        // while(left<=right){
        //     int mid = (left+right) >>> 1;
        //     if(nums[mid] > target){
        //         right = mid - 1;
        //     } else if(nums[mid] <target){
        //         left = mid +1;
        //     } else{
        //         if(mid == nums.length-1){
        //             ans[1] = nums.length-1;
        //             break;
        //         } else if (nums[mid+1] == target){
        //             left = mid + 1;
        //         } else{
        //             ans[1] = mid;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        int[] ans = new int[]{-1,-1};
        int leftIndex = findBoundary(nums, target, true);
        if(leftIndex == nums.length || nums[leftIndex]!=target) return ans;

        ans[0] = leftIndex;
        ans[1] = findBoundary(nums, target, false)-1;

        return ans;

    }

    private int findBoundary(int[] nums, int target, boolean leftRange){
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = (left+right) >>> 1;
            if(nums[mid]>target || (leftRange && nums[mid]==target)){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
// @lc code=end

