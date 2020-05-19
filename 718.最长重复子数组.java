/*
 * @lc app=leetcode.cn id=718 lang=java
 *
 * [718] 最长重复子数组
 */

// @lc code=start
// 子序列默认不连续，子数组默认连续
class Solution {
    public int findLength(int[] A, int[] B) {
        // 暴力法（5.07%， 100%）
        // int lenA = A.length;
        // int lenB = A.length;
        // int ans = -1;
        // for(int i = 0; i< lenA; i++){
        //     for(int j = 0; j< lenB; j++){
        //         int m = i, n = j, tmp = 0;
        //         while(m<lenA && n<lenB && A[m]==B[n]){
        //             tmp++;
        //             m++;
        //             n++;
        //         }
        //         ans = Math.max(ans, tmp);
        //     }
        // }
        // return ans;

        // dp（49.1%， 100%）
        int lenA = A.length, lenB = B.length, max = -1;
        int[][]dp = new int[lenA][lenB];
        for(int i=0; i<lenA; i++){
            for(int j = 0; j<lenB; j++){
                if(B[j]==A[i]){
                    dp[i][j] = 1 + (j>0&&i>0?dp[i-1][j-1]:0);
                } else{
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
// @lc code=end

