import java.util.ArrayDeque;
/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String str : tokens){
            switch(str){
                case "+":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1+num2);
                    break;
                }
                case "-":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2-num1);
                    break;
                }
                case "*":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2*num1);
                    break;
                }
                case "/":{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2/num1);
                    break;
                }
                default: stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
// @lc code=end

