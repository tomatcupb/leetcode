import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1346 lang=java
 *
 * [1346] 检查整数及其两倍数是否存在
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            if(set.contains(i*2) || (i%2==0 && set.contains(i/2))) return true;
            set.add(i);
        }
        return false;
    }
}
// @lc code=end

