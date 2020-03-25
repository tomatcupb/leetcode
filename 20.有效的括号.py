#
# @lc app=leetcode.cn id=20 lang=python
#
# [20] 有效的括号
#

# @lc code=start
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # Time Limit Exceeded
        # while '()' in s or '[]' in s or '{}':
        #     s.replace('()','')
        #     s.replace('[]','')
        #     s.replace("{}",'')
        # return s==''

        # python中list实现了stack的方法
        stack = []
        for ch in s:
            if ch=='(':
                stack.append(')')
            elif ch=='[':
                stack.append(']')
            elif ch=='{':
                stack.append('}')
            elif len(stack)==0 or stack.pop() != ch:
                return False
        return len(stack)==0


# @lc code=end
