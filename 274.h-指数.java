import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        // int len = citations.length, ans = 0, h = 0;
        // Arrays.sort(citations);
        // // 倒着算比较麻烦
        // for(int i = len-1; i>=0; i--){
        //     h = len-i;
        //     if(citations[i]<=h){
        //         return Math.max(ans, citations[i]);
        //     } else{
        //         ans = Math.max(ans, len-i);
        //     }
        // }
        // return ans;

        // 正着算
        Arrays.sort(citations);
        int len = citations.length, h = 0;
        for(int i = 0; i<len; i++){
            h = len-i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}
// @lc code=end

