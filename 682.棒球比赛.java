import java.util.ArrayDeque;

/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String str : ops){
            switch(str){
                case "C": stack.pop();break;
                case "D": stack.push(stack.peek()*2);break;
                case "+": {
                    int top = stack.pop();
                    int tmp = top+stack.peek();
                    stack.push(top);
                    stack.push(tmp);
                    break;
                }
                default: stack.push(Integer.parseInt(str));
            }
        }
        int ans = 0;
        while(!stack.isEmpty()) ans += stack.pop();
        return ans;
    }
}
// @lc code=end

