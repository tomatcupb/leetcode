/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        int i = 2;
        int sum = 0;
        double root = Math.sqrt(num);
        while(i<=root){
            if(num%i==0){
                if(i<root){
                    sum+=num/i+i;
                } else{
                    sum+=i;
                }
            }
            i++;
        }
        return num == 1? false: sum+1 == num;
    }
}
// @lc code=end

