import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */

// @lc code=start
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        ArrayList<HashMap<Integer, Integer>> list = new ArrayList<>();
        for(int i = 0; i< points.length; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j<points.length; j++){
                int distance = distance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0)+1);
            }
            list.add(map);
        }
        int sum = 0;
        for(int i = 0; i<points.length; i++){
            for(Integer count: list.get(i).values()){
                if(count>=2){
                    sum += count*(count-1);
                }
            }
        }
        return sum;
    }

    private int distance(int[] p1, int[] p2){
        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}
// @lc code=end

