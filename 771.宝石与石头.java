import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=771 lang=java
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<J.length(); i++){
            set.add(J.charAt(i));
        }
        int count = 0;
        for(int i = 0; i<S.length(); i++){
            if(set.contains(S.charAt(i))) count++;
        }
        return count;
    }
}
// @lc code=end

