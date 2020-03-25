#
# @lc app=leetcode.cn id=28 lang=python
#
# [28] 实现 strStr()
#

# @lc code=start
class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        i = 0
        if len(needle)==0:
            return 0
        while i<= len(haystack) - len(needle):
            if haystack[i:i+len(needle)]==needle:
                return i
            i = i+1
        return -1
            
# @lc code=end

