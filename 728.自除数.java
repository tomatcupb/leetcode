import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(isDividingNumber(i)) ans.add(i);
        }
        return ans;
    }

    private boolean isDividingNumber(int num){
        if(num==0) return false;
        int  p = num;
        int q;
        while(p != 0){
            q = p%10;
            if(q == 0 || num%q!=0) return false;
            p = p/10;
        }
        return true;
    }
}
// @lc code=end

