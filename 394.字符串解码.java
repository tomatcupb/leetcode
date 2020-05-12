import java.util.Stack;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Stack<Character> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        int len = s.length(), num;
        char tmp;
        
        for(int i = 0; i< len; i++){
            tmp = s.charAt(i);
            if(tmp>='0'&& tmp<='9'){
                numStack.add(tmp);
            } else if(tmp != ']'){
                charStack.push(tmp+"");
                if(tmp =='[') numStack.push(tmp);
            } else{
                StringBuilder sbNum = new StringBuilder();
                if(numStack.peek()=='[') numStack.pop();
                while(!numStack.isEmpty() && !numStack.peek().equals('[')){
                    sbNum.append(numStack.pop());
                }
                num = Integer.parseInt(sbNum.reverse().toString());
                StringBuilder sb = new StringBuilder();
                while(!charStack.peek().equals("[")){
                    sb.append(charStack.pop());
                }
                charStack.pop();
                String tmpStr = sb.reverse().toString();
                for(int j = 0; j<num-1; j++){
                    sb.append(tmpStr);
                }
                charStack.push(sb.toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str : charStack){
            sb.append(str);
        }
        return sb.toString();
    }
}
// @lc code=end

