import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        if(arr.length==0) return "/";

        Stack<String> stack = new Stack<>();
        for(String str: arr){
            if(str.equals(".") || str.equals("")){
                continue;
            } else if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else{
                stack.add(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(stack.isEmpty()){
            return "/";
        }else{
            while(!stack.isEmpty()){
                sb.insert(0, stack.pop()).insert(0, "/");
            }
        }
        return sb.toString();
    }
}
// @lc code=end

