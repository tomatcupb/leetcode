import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=819 lang=java
 *
 * [819] 最常见的单词
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // String[] arr = paragraph.toLowerCase().trim().replaceAll("[^a-z]", " ").split("\\s+");
        String[] arr = paragraph.toLowerCase().trim().split("[^a-z]+");
        Arrays.sort(arr);
        HashSet<String> set = new HashSet<>();
        for(String s: banned){
            set.add(s);
        }
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(set.contains(arr[i])) continue;
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i])>max){
                max = map.get(arr[i]);
                index = i;
            }
        }
        return arr[index];
    }
}
// @lc code=end

