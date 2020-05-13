import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=781 lang=java
 *
 * [781] 森林中的兔子
 */

// @lc code=start
class Solution {
    public int numRabbits(int[] answers) {
        // HashMap,(59.83,50%),效率较低
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int ans : answers) {
        //     map.put(ans, map.getOrDefault(ans, 0) + 1);
        // }
        // int ans = 0;
        // while (!map.keySet().isEmpty()) {
        //     Iterator<Map.Entry<Integer, Integer>> it =  map.entrySet().iterator();
        //     while(it.hasNext()){
        //         Map.Entry<Integer, Integer> entry =  it.next();
        //         int key = entry.getKey();
        //         int count = entry.getValue();
        //         ans += key+1;
        //         if(count<=key+1){
        //             it.remove();
        //         } else{
        //             entry.setValue(entry.getValue()-key-1);
        //         }
        //     }
        // }
        // return ans;


        // 数组提速惊人！(95.73%, 50%)
        int[] map = new int[1000];
        for(int num:answers) map[num]++;
        int ans = 0;
        for(int i = 0; i <1000; i++){
            while(map[i]!=0){
                ans += i+1;
                map[i] = Math.max(0, map[i]-i-1);
            }

            // if(map[i]%(i+1)==0){
            //     ans += map[i];
            // } else{
            //     ans += (map[i]-map[i]%(i+1))+(i+1);
            // }

            // 似乎floorMod没有while循环效率高
            // ans += Math.floorMod(-map[i], i+1) + map[i];

            // ans += map[i]%(i+1)==0?map[i]:(map[i]/(i+1)+1)*(i+1);
        }
        return ans;
    }
}
// @lc code=end
