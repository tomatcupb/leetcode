import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=931 lang=java
 *
 * [931] 下降路径最小和
 */

// @lc code=start
class Solution {
    public int minFallingPathSum(int[][] A) {
        // 记忆化搜索效率很低，（5.03%, 100%）
        // for(int i = 0; i<A[0].length; i++){
        //     ans = Math.min(helper(A, 0, i, 0), ans);
        // }
        // return ans;
        

        // dp提高了效率（44.27%，100%）
        int row = A.length, col = A[0].length, left, right;
        for(int i = row - 2; i>=0; i--){
            for(int j = 0; j<col; j++){
                left = j-1>=0?A[i+1][j-1]:Integer.MAX_VALUE;
                right = j+1<col?A[i+1][j+1]:Integer.MAX_VALUE;
                A[i][j] += Math.min(A[i+1][j], Math.min(left, right));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<col; i++){
            ans = Math.min(ans, A[0][i]);
        }
        return ans;
    }

    // HashMap<String, Integer> memo =  new HashMap<>();
    // int ans = Integer.MAX_VALUE;
    // private int helper(int[][] A, int i, int j, int sum){
    //     if(j<0 || j == A[i].length) return Integer.MAX_VALUE;
    //     sum += A[i][j];
    //     if(i==A.length-1){
    //         memo.put(i+" "+j, A[i][j]);
    //         return A[i][j];
    //     }
    //     int left, right, mid;
    //     if(memo.containsKey((i+1)+" "+j)){
    //         mid = memo.get((i+1)+" "+j);
    //     } else{
    //         mid = helper(A, i+1, j, sum);
    //     }
    //     if(memo.containsKey((i+1)+" "+(j+1))){
    //         right = memo.get((i+1)+" "+(j+1));
    //     } else{
    //         right = helper(A, i+1, j+1, sum);
    //     }
    //     if(memo.containsKey((i+1)+" "+(j-1))){
    //         left = memo.get((i+1)+" "+(j-1));
    //     } else{
    //         left = helper(A, i+1, j-1, sum);
    //     }
    //     int temp = A[i][j] + Math.min(left, Math.min(mid, right));
    //     memo.put(i+" "+j, temp);
    //     return temp;
    // }
}
// @lc code=end

