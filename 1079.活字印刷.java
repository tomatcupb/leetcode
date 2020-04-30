import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=1079 lang=java
 *
 * [1079] 活字印刷
 */

// @lc code=start
class Solution {

    // int len;
    public int numTilePossibilities(String tiles) {
        // char[] chars = tiles.toCharArray();
        // len = chars.length;
        // boolean[] isVisited = new boolean[len];
        // for(int i = 1; i<=len; i++){
        //     backtrack(i, chars, new StringBuilder(), isVisited);
        // }
        // return set.size();

        

        int[] counter = new int[26];
        for(int i = 0; i< tiles.length(); i++){
            counter[tiles.charAt(i)-'A']++;
        }
        helper(counter);
        return res;
    }
    //高级回溯，83%， 60%。
    int res = 0;
    private void helper(int[] counter){
        for(int i = 0; i< 26; i++){
            if(counter[i]==0) continue;
            res++;
            counter[i]--;

            helper(counter);
            counter[i]++;
        }

    }

    //暴力回溯+set去重，效率较低（12%，20%）
    // HashSet<String> set = new HashSet<>();
    // private void backtrack(int l, char[] chars, StringBuilder sb, boolean[] isVisited){
    //     if(sb.length() == l){
    //         set.add(sb.toString());
    //         return;
    //     }
    //     for(int i = 0; i< len; i++){
    //         if(!isVisited[i]){
    //             sb.append(chars[i]);
    //             isVisited[i] = true;
    //             backtrack(l, chars, new StringBuilder(sb), isVisited);
    //             isVisited[i] = false;
    //             sb.deleteCharAt(sb.length()-1);
    //         }
    //     }
    // }
}
// @lc code=end

