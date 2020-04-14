import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=621 lang=java
 *
 * [621] 任务调度器
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {
        // int sum = 0;
        // HashSet<Character> set = new HashSet<>();
        // for(int i = 0; i<tasks.length; i++){
        //     if(tasks[i]=='*') continue;
        //     sum = sum+1+n;
        //     int count = 0;
        //     loop:
        //     for(int j = i+1; j<tasks.length;j++){
        //         if(count==n) break loop;
        //         if(tasks[j]!=tasks[i] && !set.contains(tasks[j])){
        //             count++;
        //             set.add(tasks[j]);
        //             tasks[j] = '*';
        //         }
        //     }
        //     set.clear();
        //     tasks[i] = '*';
        //     System.out.println(Arrays.toString(tasks));
        // }
        // return sum;

        // 贪心策略：优先找出现次数最多的进程去执行
        int[] map = new int[26];
        for(char c:tasks){
            map[c-'A']++;
        }
        Arrays.sort(map);
        int time = 0;
        // map[25]出现次数最多的进程
        while(map[25]>0){
            int count = 0;
            loop:
            while(count<=n){
                // 这是防止出现A,B n=2的情况，否则time = 1+2=3
                if(map[25]==0) break loop;
                if(count<26 && map[25-count]>0){
                    map[25-count]--;
                }
                time++;
                count++;
            }
            Arrays.sort(map);
        }
        return time;
    }
}
// @lc code=end

