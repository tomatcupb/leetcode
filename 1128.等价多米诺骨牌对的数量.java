import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1128 lang=java
 *
 * [1128] 等价多米诺骨牌对的数量
 */

// @lc code=start
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // HashMap(31.75%, 100%)
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int[] arr : dominoes){
        //     Arrays.sort(arr);
        //     int key = arr[0]*10+arr[1];
        //     map.put(key, map.getOrDefault(key, 0)+1);
        // }
        // int ans = 0;
        // for(int i: map.values()){
        //     ans += i*(i-1)/2;
        // }
        // return ans;

        // 数组(78.91%, 100%)
        int[] map = new int[100];
        for(int[] arr: dominoes){
            Arrays.sort(arr);
            map[arr[0]*10+arr[1]]++;
        }
        int ans = 0;
        for(int i = 0; i<100; i++){
            ans += (map[i]-1)*map[i]/2;
        }
        return ans;
    }
}
// @lc code=end

