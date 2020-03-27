import java.util.HashMap;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< nums2.length; i++){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }
            stack.add(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i< nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
// @lc code=end

