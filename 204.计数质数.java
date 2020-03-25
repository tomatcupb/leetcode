/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 1; i<n ; i++){
            int j;
            loop:
            for(j = 1; j<= Math.sqrt(i); j++){
                if(i%j==0 && j!=1){
                    break loop;
                }
            }
            if(i == 2 || i==3 || (j == (int) Math.sqrt(i)+1 && i%(j-1)!=0)){
                count ++;
            }
        }
        return count;
    }
}
// @lc code=end

