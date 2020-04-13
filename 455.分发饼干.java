import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    // 这一题的贪心思想是，用尽量小的饼干去满足小需求的孩子，所以需要进行排序先
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int kids = 0;
        int candy = 0;
        int ans = 0;
        while(candy<s.length && kids<g.length){
            if(g[kids]<=s[candy]){
                ans++;
                kids++;
                candy++;
            } else{
                candy++;
            }
        }
        return ans;
    }
}
// @lc code=end

