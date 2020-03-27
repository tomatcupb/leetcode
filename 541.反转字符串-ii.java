import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        // StringBuilder sb = new StringBuilder();
        // if(s.length()<=k) return new StringBuilder(s).reverse().toString();
        // int cur = k-1;
        // boolean isOdd = true;
        // while(cur<s.length()){
        //     if(isOdd){
        //         for(int i = 0; i<k; i++){
        //             sb.append(s.charAt(cur-i));
        //         }
        //     } else{
        //         for(int i = 0; i<k; i++){
        //             sb.append(s.charAt(cur-(k-i)+1));
        //         }
        //     }
        //     cur += k;
        //     isOdd = !isOdd;
        // }
        // cur -= k;
        // if(isOdd){
        //     for(int i = s.length() - 1; i>cur; i--){
        //         sb.append(s.charAt(i));
        //     }
        // } else{
        //     for(int i = cur+1; i<s.length(); i++){
        //         sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString();

        char[] chars = s.toCharArray();
        int cur;
        for(cur = 0; cur<s.length(); cur+=2*k){
            //加了这一步，省去了判断余数的步骤
            int right = Math.min(cur+k-1, s.length()-1);
            reverseArr(chars, cur, right);
        }
        return new String(chars);
    }

    private void reverseArr(char[] chars, int start, int end){
        while(start<end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end

