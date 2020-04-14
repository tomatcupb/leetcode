import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String S) {
        // 1. 递归
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i<S.length();i++){
        //     if(i==S.length()-1 || S.charAt(i)!=S.charAt(i+1)){
        //         sb.append(S.charAt(i));
        //     } else{
        //         i ++;
        //     }
        // }
        // String sub = sb.toString();
        // if(sub.equals(S)) return sub;
        // return removeDuplicates(sub);

        // 2. 栈
        // Stack<Character> stack = new Stack<>();
        // for(char c: S.toCharArray()){
        //     if(stack.isEmpty() || c!=stack.peek()){
        //         stack.add(c);
        //     } else{
        //         stack.pop();
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // for(Character c : stack){
        //     sb.append(c);
        // }
        // return sb.toString();

        // 3. 栈的思想
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            if(sb.length()==0 || c!= sb.charAt(sb.length()-1)){
                sb.append(c);
            } else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

