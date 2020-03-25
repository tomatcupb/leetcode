/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length == 0) return A;
        int head = 0;
        int tail = A.length-1;
        while(head < tail){
            if(A[head]%2==1 && A[tail]%2==0){
                int temp = A[head];
                A[head] = A[tail];
                A[tail] = temp;
                head++;
                tail--;
            } else if(A[head]%2==1){
                tail--;
            } else if(A[tail]%2==0){
                head++;
            } else {
                head++;
                tail--;
            }
        }
        return A;
    }
}
// @lc code=end

