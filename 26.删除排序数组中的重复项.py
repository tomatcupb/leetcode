#
# @lc app=leetcode.cn id=26 lang=python
#
# [26] 删除排序数组中的重复项
#

# @lc code=start
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <=1:
            return len(nums)
        p = 1
        i = 1
        while i < len(nums):
            while nums[i-1]==nums[i]:
                i = i+1
                if i == len(nums):
                    return p
            nums[p] = nums[i]
            p = p+1
            i = i+1
        return p
# @lc code=end
