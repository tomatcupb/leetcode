import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=874 lang=java
 *
 * [874] 模拟行走机器人
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0, dirction = 0, ans = 0;
        int[] xIncr = {0,1,0,-1};
        int[] yIncr = {1,0,-1,0};
        HashSet<String> set = new HashSet<>();
        for(int[] ob: obstacles){
            set.add(ob[0]+" "+ob[1]);
        }
        for(int command : commands){
            if(command>=0){
                for(int i = 0; i<command; i++){
                    x += xIncr[dirction];
                    y += yIncr[dirction];
                    if(set.contains(x+" "+y)){
                        x -= xIncr[dirction];
                        y -= yIncr[dirction];
                        break;
                    } else{
                        ans = Math.max(ans, x*x+y*y);
                    }
                }
            } else if(command==-1){
                dirction = dirction==3?0:dirction+1;
            } else{
                dirction = dirction==0?3:dirction-1;
            }
        }
        return ans;
    }
}
// @lc code=end

