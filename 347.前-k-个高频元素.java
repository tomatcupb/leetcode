import java.util.HashMap;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // 优先队列，出现次数少的元素排在队首
        PriorityQueue<Integer> q = new PriorityQueue<>((n1, n2)->map.get(n1)-map.get(n2));

        for(int key: map.keySet()){
            q.add(key);
            if(q.size()>k) q.remove();
        }

        int[] res = new int[k];
        for(int i = 0; i< k; i++){
            res[i] = q.remove();
        }
        return res;
    }
}
// @lc code=end

