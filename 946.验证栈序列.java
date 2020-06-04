import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=946 lang=java
 *
 * [946] 验证栈序列
 */

// @lc code=start
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        for(int num: pushed){
            stack.push(num);
            while(!stack.isEmpty() && stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

