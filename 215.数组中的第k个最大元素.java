import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 直接用PriorityQueue
        // PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        // for(int num : nums){
        //     queue.add(num);
        // }
        // for(int i = 1; i<k; i++){
        //     queue.remove();
        // }
        // return  queue.peek();

        // 自己构建的大顶堆效率更高一些
        int len = nums.length;
        for(int i = len/2-1; i>=0; i--){
            constructHeap(nums, i, len);
        }

        for(int i = 1; i<k; i++){
            int tmp = nums[0];
            nums[0] = nums[len-i];
            nums[len-i] = tmp;

            constructHeap(nums, 0, len-i);
        }
        return nums[0];
    }

    private void constructHeap(int[] nums, int i, int len){
        int tmp = nums[i];
        for(int k = 2*i+1; k<len; k=2*k+1){
            if(k+1<len && nums[k+1]>nums[k]) k++;
            if(tmp<nums[k]){
                nums[i] = nums[k];
                i = k;
            } else{
                break;
            }
        }
        nums[i] = tmp;
    }
}
// @lc code=end

