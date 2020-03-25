/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        int i = 0;
        int j = 0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            } else if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                j++;
            } else{
                return false;
            }
        }
        if(i != name.length()){
            return false;
        } else if(j==typed.length()){
            return true;
        } else{
            for(int k = j-1; k<typed.length()-1;k++){
                if(typed.charAt(k)!=typed.charAt(k+1)){
                    return false;
                }
            }
            return true;
        }
    }
}
// @lc code=end

