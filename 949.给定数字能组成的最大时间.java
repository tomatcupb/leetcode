import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=949 lang=java
 *
 * [949] 给定数字能组成的最大时间
 */

// @lc code=start
class Solution {
    public String largestTimeFromDigits(int[] A) {
        int ans = -1;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(j!=i){
                    for(int k = 0; k<4;k++){
                        if(k!= i && k != j){
                            int l = 6 - i - j - k;

                            int hour = A[i]*10+A[j];
                            int min = A[k]*10+A[l];
                            if(hour<24 && min<60){
                                ans = Math.max(ans, hour*60+min);
                            }
                        }
                    }
                }
            }
        }
        return ans>=0?String.format("%02d:%02d", ans/60, ans%60):"";
    }
}
// @lc code=end

