import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if(rowIndex == 0){
            return list;
        }
        if(rowIndex == 1){
            list.add(1);
            return list;
        }
        int n = 1;
        list.add(1);
        List<Integer> result = new ArrayList<>();
        while(n<rowIndex){
            result = new ArrayList<>();
            result.add(1);
            for(int i = 1; i< list.size(); i++){
                int num = list.get(i-1)+list.get(i);
                result.add(num);
            }
            result.add(1);
            list = new ArrayList<>();
            list.addAll(result);
            n++;
        }
        return result;
    }
}
// @lc code=end

