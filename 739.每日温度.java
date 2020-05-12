import java.util.Stack;

/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    //关键思路，比T[i]小的T[i+x]不需入栈！
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack<>();        

        for(int i = len-1; i>=0; i--){
            while(!stack.isEmpty() && T[i]>=T[stack.peek()]) stack.pop();
            ans[i] = stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}
// @lc code=end

