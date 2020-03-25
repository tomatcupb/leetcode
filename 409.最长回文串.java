import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        // HashMap<Character, Integer> map =new HashMap<>();
        // for(int i = 0; i<s.length(); i++){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), 1);
        //     } else{
        //         map.replace(s.charAt(i), map.get(s.charAt(i))+1);
        //     }
        // }
        // int sum = 0;
        // boolean flag = false;
        // for(Character k: map.keySet()){
        //     sum = sum + (map.get(k)/2)*2;
        //     if(map.get(k)%2!=0){
        //         flag = true;
        //     }
        // }
        // return flag?sum+1:sum;

        int[] chars = new int[128];
        for(char c:s.toCharArray()){
            chars[c]++;
        }
        int sum = 0;
        boolean flag = false;
        for(int i: chars){
            sum = sum + i/2*2;
            if(i%2==1){
                flag = true;
            }
        }
        return flag?sum+1:sum; 
    }
}
// @lc code=end

