#
# @lc app=leetcode.cn id=13 lang=python
#
# [13] 罗马数字转整数
#

# @lc code=start
class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict_map = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
        sum = 0
        for i in range(len(s)):
            if i>0 and dict_map[s[i]]>dict_map[s[i-1]]:
                sum = sum + dict_map[s[i]] - 2 * dict_map[s[i-1]]
            else:
                sum = sum + dict_map[s[i]]
        return sum
# @lc code=end

