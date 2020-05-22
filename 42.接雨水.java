import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int left = 0, right = 0, ans = 0, len = height.length;
        if(len<=2) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<len; i++){
            if((i==0 && height[i]>height[i+1]) || 
            (i==len-1 && height[i]>height[i-1]) || 
            (i>0 && i<len-1 && height[i]>height[i-1] && height[i]>height[i+1])){
                list.add(i);
            }
        }
        for(int i = 0; i<list.size()-1; i++){
            left = list.get(i);
            right = list.get(i+1);
            int tmpHeight = Math.min(height[left], height[right]);
            int tmp = tmpHeight*(right-left-1);
            for(int j = left+1; j<right; j++){
                tmp -= Math.min(tmpHeight, height[j]);
            }
            ans += tmp;
        }
        return ans;
    }
}
// @lc code=end

