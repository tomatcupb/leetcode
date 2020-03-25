#
# @lc app=leetcode.cn id=14 lang=python
#
# [14] 最长公共前缀
#

# @lc code=start
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) ==0 or strs == None:
            return ""
        res = strs[0]
        for string in strs:
            while not string.startswith(res):
                if len(res)==1:
                    return ""
                res = res[0:len(res)-1]
        return res
# @lc code=end

