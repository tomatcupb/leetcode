/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        if(nums.length==0) return ans;
        int rotateIndex = findIndex(nums);
        if(nums[rotateIndex] == target) return rotateIndex;
        if(nums[nums.length-1]>=target){
            ans = binarySearch(nums, target, rotateIndex, nums.length-1);
        } else{
            ans = binarySearch(nums, target, 0, rotateIndex-1);
        }
        return ans;
    }

    private int binarySearch(int[] nums, int target, int left, int right){
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target) {
                return mid;
            }else if(nums[mid]>target){
                right = mid -1;
            } else{
                left = mid+1;
            }
        }
        return -1;
    }

    private int findIndex(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums[left]<=nums[right]) return 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[mid+1]){
                return mid+1;
            } else if(nums[mid]>=nums[left]){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

