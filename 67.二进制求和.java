/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
    //     int a1 = bTod(a);
    //     int b1 = bTod(b);
    //     return dTob(a1+b1);
    // }

    // private int bTod(String str){
    //     int sum = 0;
    //     for(int i = 0; i< str.length(); i++){
    //         int num = Integer.parseInt(str.substring(i, i+1));
    //         sum += num * Math.pow(2, str.length()-i-1);
    //     }        
    //     return sum;
    // }

    // private String dTob(int dec){
    //     if(dec == 0){
    //         return "0";
    //     }
    //     String res = "";
    //     while(dec != 0){
    //         int quotient = dec / 2;
    //         int remainder = dec % 2; 
    //         dec = quotient;
    //         res = remainder + res;
    //     }
    //     return res;


    int n = a.length(), m = b.length();
    if (n < m) return addBinary(b, a);
    int L = Math.max(n, m);

    StringBuilder sb = new StringBuilder();
    int carry = 0, j = m - 1;
    for(int i = L - 1; i > -1; --i) {
      if (a.charAt(i) == '1') ++carry;
      if (j > -1 && b.charAt(j--) == '1') ++carry;

      if (carry % 2 == 1) sb.append('1');
      else sb.append('0');

      carry /= 2;
    }
    if (carry == 1) sb.append('1');
    sb.reverse();

    return sb.toString();
    }
}
// @lc code=end

