import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(set.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
// @lc code=end

