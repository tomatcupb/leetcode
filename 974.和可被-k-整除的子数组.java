/*
 * @lc app=leetcode.cn id=974 lang=java
 *
 * [974] 和可被 K 整除的子数组
 */

// @lc code=start
class Solution {
    public int subarraysDivByK(int[] A, int K) {
        // 暴力前缀和，o(n2)超时了
        // int len = A.length, ans = 0;
        // if(len==0) return 0;
        // int[] helper = new int[len];
        // helper[0] = A[0];
        // for(int i = 1; i<len; i++){
        //     helper[i] = helper[i-1]+A[i];
        //     if(helper[i]%K==0) ans++;
        // }

        // for(int i = 1; i<len; i++){
        //     int tmp = A[i-1];
        //     for(int j = i; j<len; j++){
        //         helper[j] = helper[j] - tmp;
        //         if(helper[j]%K==0) ans++;
        //     }
        // }
        // return A[0]%K==0?ans+1:ans;

        /**
         * 前缀和的思想：
         * sum(int[i:j]) <=> sum(0,j)-sum(0,i)!!
         * 
         * 本题思路：
         * 而要使sum(0,j)-sum(0,i)%K==0，
         * 即sum(0,j)%K == sum(0,i)%K
         * 统计各个前缀和的余数，任意取相等的两个即可
         * 这两段相等的前缀和只差等于0.也就是中间的那段子数组和能被K整除
         */
        int len = A.length;
        int[] helper = new int[len+1];
        int[] mod = new int[K];
        // 为了取到以A[0]开头的子数组，要把helper[0]=0
        helper[0] = 0;
        mod[0]++;
        for(int i = 0; i<A.length; i++){
            helper[i+1] = helper[i]+A[i];
            /**
             * 余数n为负数时，余n<=>n+K
             * e.g. -8除以5余-3，等价于余-3+5=2
             */
            int tmp = helper[i+1]%K;
            tmp = tmp<0?tmp+K:tmp;
            mod[tmp]++;
        }

        int ans = 0;
        for(int i = 0; i<K; i++){
            ans += mod[i]*(mod[i]-1)/2;
        }
        return ans;
    }
}
// @lc code=end

