/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 重复 N 次的元素
 */

// @lc code=start
class Solution {
        public int repeatedNTimes(int[] A) {
            for (int k = 1; k <= 3; ++k)
                for (int i = 0; i < A.length - k; ++i)
                    if (A[i] == A[i+k])
                        return A[i];
    
            throw null;
        }
}
// @lc code=end

