import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        // 1. 纯粹模拟手算的暴力竖式方法（14ms，39.51%）
    //     if(num1.equals("0") || num2.equals("0")) return "0";
    //     int len1 = num1.length();
    //     int len2 = num2.length();
    //     int carry;
    //     int max = 0;
    //     ArrayList<String> list = new ArrayList<>();
    //     for(int i = len1-1 ;i>=0; i--){
    //         carry = 0;
    //         // 此处用字符加减法为好，要不然太粗暴了
    //         // int temI = Integer.parseInt(num1.charAt(i)+"");
    //         int temI = num1.charAt(i)-'0';
    //         StringBuilder sb = new StringBuilder();
    //         for(int j = len2-1; j>=0; j--){
    //             // int temp = Integer.parseInt(num2.charAt(j)+"")*temI+carry;
    //             int temp = (num2.charAt(j)-'0')*temI+carry;
    //             carry = temp/10;
    //             sb.append(temp%10);
    //             // sb.insert(0, temp%10);
    //         }
    //         if(carry!=0) sb.append(carry);
    //         sb.reverse();
    //         for(int k = 0; k<len1-i-1; k++){
    //             sb.append("0");
    //         }
    //         if(sb.length()>max) max = sb.length();
    //         list.add(sb.toString());
    //     }
    //     // 此处可以优化：不需要存储所有的乘积，乘出来的结果直接相加，两个临时变量存储就够了
    //     int size = list.size();
    //     carry = 0;
    //     StringBuilder ans = new StringBuilder();
    //     for(int i = 0; i<max; i++){
    //         int sum = 0;
    //         for(int j = 0; j< size; j++){
    //             String str = list.get(j);
    //             if(str.length()>i){
    //                 sum += str.charAt(str.length()-i-1)-'0';
    //             }
    //         }
    //         sum += carry;
    //         carry = sum/10;
    //         ans.append(sum%10);
    //         // ans.insert(0, sum%10);
    //     }
    //     if(carry!=0) ans.append(carry);
    //     ans.reverse();
    //     return ans.toString();

        // 2. 优化的竖式计算方法(7ms,61%)
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1+len2];
        for(int i = 0; i<len1; i++){
            for(int j = 0; j< len2; j++){
                int temp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                res[i+j+1] += temp%10;
                res[i+j] += temp/10;
            }
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = len1+len2-1; i>=1; i--){
            sb.append((res[i]+carry)%10);
            carry = (res[i]+carry)/10;
        }
        if(carry+res[0]!=0) sb.append(carry+res[0]);
        return sb.reverse().toString();
    }
}
// @lc code=end

