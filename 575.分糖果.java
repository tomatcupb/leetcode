import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet();
        int type = 0;
        for(int s : candies){
            if(!set.contains(s)){
                set.add(s);
                type ++;
            }
        }
       return type>=candies.length/2?candies.length/2:type;
    }
}
// @lc code=end

