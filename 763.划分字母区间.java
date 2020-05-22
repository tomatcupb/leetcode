import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        // 找到字符串中每个字母出现的最后索引
        for(int i = 0; i<S.length(); i++){
            last[S.charAt(i)-'a'] = i;
        }

        List<Integer> list = new ArrayList<>();
        int start = 0, end = 0;
        for(int i = 0; i< S.length(); i++){
            end = Math.max(end, last[S.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start = end+1;
            }
        }
        return list;
    }
}
// @lc code=end

