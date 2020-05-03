import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1029 lang=java
 *
 * [1029] 两地调度
 */

// @lc code=start
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        //贪心算法
        //策略：假设2n人先全部到A,再挑一半人到B,这一半人的花费是∑(price(B)-price(A))
        //按照price(B)-price(A)排序，挑出前N个即可
        int sum = 0;
        for(int i = 0; i<costs.length; i++){
            sum += costs[i][0];
        }
        Arrays.sort(costs, (c1, c2)->((c1[1]-c1[0])-(c2[1]-c2[0])));
        for(int i = 0; i<costs.length/2; i++){
            sum += costs[i][1]-costs[i][0];
        }
        return sum;
    }
}
// @lc code=end

