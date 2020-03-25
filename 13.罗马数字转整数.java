import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            nums[i] = map.get(s.charAt(i));
            if (i > 0 && nums[i] > nums[i - 1]) {
                nums[i - 1] = -nums[i - 1];
            }
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
// @lc code=end
