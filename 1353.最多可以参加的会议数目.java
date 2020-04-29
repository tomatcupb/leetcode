import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1353 lang=java
 *
 * [1353] 最多可以参加的会议数目
 */

// @lc code=start
class Solution {
    public int maxEvents(int[][] events) {
        // 贪心策略：
        //1. 先按照早结束的会排序
        //2. 迟结束的会同时需要注意区间
        //set此处的运用很巧妙
        Arrays.sort(events, (e1,e2)->{return e1[1]==e2[1]?e1[0]-e2[0]:e1[1]-e2[1];});
        HashSet<Integer> set =  new HashSet<>();
        for(int[] e: events){
            for(int i = e[0]; i<= e[1]; i++){
                if(set.add(i)) break;
            }
        }
        return set.size();
    }
}
// @lc code=end

