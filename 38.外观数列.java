/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        return say(countAndSay(n-1));
    }

    private String say(String str){
        // int p = 0;
        // String res = "";
        // String cur = str.substring(0,1);
        // for(int k = 0; k< str.length(); k++){
        //     if(!str.substring(k,k+1).equals(cur)){
        //         res = res+(k-p)+cur;
        //         cur = str.substring(k,k+1);
        //         p = k;
        //     }
        //     if(k == str.length()-1){
        //         res = res+(k-p+1)+cur;
        //     }
        // }
        // return res;
        char[] chars = str.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        char cur = chars[0];
        for(char c: chars){
            if(c==cur){
                count++;
            }else{
                sb = sb.append(count).append(cur);
                cur = c;
                count = 1;
            }
        }
        sb = sb.append(count).append(cur);
        return sb.toString();
    }
}
// @lc code=end

