#
# @lc app=leetcode.cn id=1 lang=python
#
# [1] 两数之和
#

# @lc code=start
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #        if nums[i]+nums[j] == target and i != j:
        #             return [i,j]
        tracker_dict = {}
        for i in range(len(nums)):
            dif = target - nums[i]
            if tracker_dict.get(dif) != None:
                return [tracker_dict.get(dif), i]
            else:
                tracker_dict[nums[i]] = i
    
# @lc code=end

