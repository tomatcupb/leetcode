#
# @lc app=leetcode.cn id=9 lang=python
#
# [9] 回文数
#

# @lc code=start
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0 or (x%10==0 and x!=0):
            return False
        temp = 0
        origin =x
        while x!=0:
            temp = temp*10 + x%10
            x /= 10
        return temp==origin
# @lc code=end
