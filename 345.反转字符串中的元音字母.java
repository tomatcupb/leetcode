import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int head = 0;
        int tail = s.length()-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] chars= s.toCharArray();
        while(head<tail){
            if(!set.contains(chars[head])){
                head++;
            }
            if(!set.contains(chars[tail])){
                tail--;
            }
            if(head<tail && set.contains(chars[head]) && set.contains(chars[tail])){
                char temp = chars[head];
                chars[head] = chars[tail];
                chars[tail] = temp;
                head++;
                tail--;
            }
        }
        return String.valueOf(chars);
    }
}
// @lc code=end

