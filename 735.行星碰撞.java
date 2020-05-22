import java.util.ArrayDeque;

/*
 * @lc app=leetcode.cn id=735 lang=java
 *
 * [735] 行星碰撞
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        loop:
        for(int out: asteroids){
            // 数组元素<0，栈顶元素>0，栈顶元素绝对值<=数组元素的绝对值时，栈顶元素出栈
            while(out<0 && !stack.isEmpty() && stack.peek()>0 && stack.peek()+out<=0){
                int top = stack.pop();
                // 绝对值相等，相互抵消
                if(top+out==0) continue loop;
            }
            // 栈空，栈顶元素<0，数组元素>0，数组元素入栈
            if(stack.isEmpty() || stack.peek()<0 || out>0) stack.push(out); 
        }

        int size = stack.size();
        int[] ans = new int[size];
        for(int i = size-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
// @lc code=end

