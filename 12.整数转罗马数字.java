/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        // StringBuilder sb = new StringBuilder();
        // int thousand = num/1000;
        // num %= 1000;
        // for(int i = 0; i<thousand; i++){
        //     sb.append("M");
        // }
        // int hundred = num/100;
        // num %= 100;
        // if(hundred==4){
        //     sb.append("CD");
        // } else if(hundred==9){
        //     sb.append("CM");
        // } else{
        //     if(hundred>=5) sb.append("D");
        //     for(int i =0; i<hundred%5;i++){
        //         sb.append("C");
        //     }
        // }
        // int ten = num/10;
        // num %= 10;
        // if(ten==4){
        //     sb.append("XL");
        // } else if(ten==9){
        //     sb.append("XC");
        // } else{
        //     if(ten>=5) sb.append("L");
        //     for(int i =0; i<ten%5;i++){
        //         sb.append("X");
        //     }
        // }

        // if(num==4){
        //     sb.append("IV");
        // } else if(num==9){
        //     sb.append("IX");
        // } else{
        //     if(num>=5) sb.append("V");
        //     for(int i =0; i<num%5;i++){
        //         sb.append("I");
        //     }
        // }
        
        // return sb.toString();
        

        StringBuilder sb = new StringBuilder();
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] digit = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i = 0; i< roman.length; i++){
            while(num>=digit[i]){
                sb.append(roman[i]);
                num -= digit[i];
            }
        }
        return sb.toString();
    }
}
// @lc code=end

