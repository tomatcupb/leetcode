/*
 * @lc app=leetcode.cn id=1201 lang=java
 *
 * [1201] 丑数 III
 */

// @lc code=start
class Solution {
    public static int nthUglyNumber(int n, int a, int b, int c) {
        // 暴力法o(n)超时
        // long ans=1;
        // long pa=1, pb= 1, pc=1;
        // long tmpA, tmpB, tmpC;
        // for(int i = 0; i<n; i++){
        //     // 注意tmpA, tmpB, tmpC可能越界Integer
        //     tmpA = pa*a;
        //     tmpB = pb*b;
        //     tmpC = pc*c;
        //     ans = Math.min(tmpA, Math.min(tmpB, tmpC));
        //     if(ans==tmpA) pa++;
        //     if(ans==tmpB) pb++;
        //     if(ans==tmpC) pc++;
        // }
        // return (int)ans;


        // 二分法的思路，但是要注意integer越界
        long low = Math.min(a, Math.min(b, c));
        long high = n*low;
        long ans = binarySearch(low, high, n, a, b, c);

        int restA = (int)ans%a;
        int restB = (int)ans%b;
        int restC = (int)ans%c;

        return (int)ans - Math.min(restA, Math.min(restB, restC));
    }

    // 辗转相除法求最大公约数
    // 最小公倍数 = ab/最大公约数
    private static long MCM(long a, long b){
        long ab = a*b;
        while(b>0){
            long tmp = a%b;
            a = b;
            b = tmp;
        }
        return ab/a;
    }

    private static long binarySearch(long low, long high, int n, int a, int b, int c){
        if(low >= high) return low;
        long mid = (low+high)>>>1;
        long cnt = mid/a+mid/b+mid/c-mid/MCM(a, b)-mid/MCM(a, c)-mid/MCM(b, c)+mid/MCM(MCM(a, b),c);
        if(cnt==n) return mid;
        if(cnt>n) return binarySearch(low, mid-1, n, a, b, c);
        return binarySearch(mid+1, high, n, a, b, c);
    }
}
// @lc code=end

