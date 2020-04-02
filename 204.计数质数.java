/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        // int count = 0;
        // for(int i = 0; i<n; i++){
        //     if(isPrimes(i)) count++;
        // }
        // return count;

        boolean[] isPrime = new boolean[n + 1];
        int count = 0;
        for (int i = 2;  i < n; i++) {
            if (isPrime[i] == false) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }


    // 超时了
    // private boolean isPrimes(int n){
    //     if(n<=1) return false;
    //     if(n==2) return true;

    //     int root = (int)Math.sqrt(n);
    //     int i = 2;
    //     while(i <= root){
    //         if(n%i==0) return false;
    //         i++;
    //     }
    //     return true;
    // }
}
// @lc code=end

