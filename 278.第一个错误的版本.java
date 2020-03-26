/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // for(int i = 1; i<=n; i++){
        // if(isBadVersion(i)) return i;
        // }
        // return 0;

        if (isBadVersion(1)) return 1;
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left+right)>>>1;
            if (!isBadVersion(mid)) {
                left = mid + 1;
            } else if (!isBadVersion(mid - 1)) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
// @lc code=end

