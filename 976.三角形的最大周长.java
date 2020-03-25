import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=976 lang=java
 *
 * [976] 三角形的最大周长
 */

// @lc code=start
class Solution {
    public int largestPerimeter(int[] A) {
        // int sum = 0;
        // for(int i = 0; i<A.length; i++){
        //     for(int j = 0; j<A.length; j++){
        //         if(j!=i){
        //             for(int k = 0; k<A.length; k++){
        //                 if(k!=i && k!=j && A[i]+A[j]>A[k] && A[i]+A[k]>A[j] && A[j]+A[k]>A[i] && A[j]+A[k]+A[i]>sum){
        //                     sum = A[j]+A[k]+A[i];
        //                 }
        //             }
        //         }
        //     }
        // }
        Arrays.sort(A);
        for(int i = A.length-3; i>=0; i--){
            if(A[i]+A[i+1]>A[i+2]){
                return A[i]+A[i+1]+A[i+2];
            }
        }
        return 0;
    }
}
// @lc code=end

