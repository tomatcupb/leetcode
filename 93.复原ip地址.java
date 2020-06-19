import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        size =s.length();
        backtrack(s, 0, new StringBuilder(), 0);
        return ans;
    }
    int size;
    List<String> ans = new ArrayList<>();
    private void backtrack(String s, int start, StringBuilder sb, int count){
        // 大于4段退出
        if(count>4) return;
        if(count==4){
            if(sb.length()==size+4){
                // 等于4段且到了最后的长度
                ans.add(sb.deleteCharAt(size+3).toString());
            } else{
                // 否则退出
                return;
            }
        }
        String str = s.substring(start);
        for(int i = 1; i<=Math.min(3, str.length()); i++){
            String str1 = str.substring(0,i);
            // 防止切分010，01这样的无效段
            if(i>1 && str1.startsWith("0")) break;
            int len = sb.length();
            // 条件1：当前的str1对应的数组<=255
            // 条件2：剩余的长度小于等于剩余段数*3
            if(Integer.parseInt(str1)<=255 && (str.length()-i<=(3-count)*3)){
                sb.append(str1).append(".");
                backtrack(s, start+i, new StringBuilder(sb), count+1);
                // 记得回退
                sb.delete(len, sb.length());
            }
        }
    }
}
// @lc code=end

