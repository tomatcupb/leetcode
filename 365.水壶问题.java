// import java.util.AbstractMap;
// import java.util.HashSet;
// import java.util.Map;
// import java.util.Stack;
// import java.util.Map.Entry;
import java.util.*;

/*
 * @lc app=leetcode.cn id=365 lang=java
 *
 * [365] 水壶问题
 */

// @lc code=start
class Solution {

    public boolean canMeasureWater(int x, int y, int z) {
        //dfs，利用java的Map.Entry代替pair
        if (z == 0) return true;
        if (x + y < z) return false;
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        stack.push(new AbstractMap.SimpleEntry<>(0, 0));
        HashSet<Map.Entry<Integer, Integer>> set = new HashSet<>();
        int remainX, remainY;
        Map.Entry<Integer, Integer> entry;
        while(!stack.isEmpty()){
            entry = stack.pop();
            remainX = entry.getKey();
            remainY = entry.getValue();
            if(remainX==z || remainY==z || remainX+remainY==z) return true;
            addINtoStack(set, new AbstractMap.SimpleEntry<>(x,remainY), stack);
            addINtoStack(set, new AbstractMap.SimpleEntry<>(remainX,y), stack);
            addINtoStack(set, new AbstractMap.SimpleEntry<>(0,remainY), stack);
            addINtoStack(set, new AbstractMap.SimpleEntry<>(remainX,0), stack);
            addINtoStack(set, new AbstractMap.SimpleEntry<>(Math.max(remainX+remainY-y, 0), Math.min(y, remainX+remainY)), stack);
            addINtoStack(set, new AbstractMap.SimpleEntry<>(Math.min(x, remainX+remainY), Math.max(remainX+remainY-x, 0)), stack);
        }
        return false;
    }

    private void addINtoStack(HashSet<Map.Entry<Integer, Integer>> set, Map.Entry<Integer, Integer> newEntry, Stack<Map.Entry<Integer, Integer>> stack){
        if(!set.contains(newEntry)){
            set.add(newEntry);
            stack.add(newEntry);
        }
    }
}
// @lc code=end

