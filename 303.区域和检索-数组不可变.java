/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */

// @lc code=start
class NumArray {
    int[] data;
    public NumArray(int[] nums) {
        data = nums;
    }
    
    public int sumRange(int i, int j) {
        if(j>=data.length){
            return -1;
        }
        int sum = 0;
        for(int m = i; m<=j; m++){
            sum = sum + data[m];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
// @lc code=end

