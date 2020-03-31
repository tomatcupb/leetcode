import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 */

// @lc code=start
class Solution {
    int count;
    public String getPermutation(int n, int k) {
        // List<List<Integer>> ans = new ArrayList<>();
        // boolean[] isVisited = new boolean[n];
        // backtrack(ans, new LinkedList<>(), n, isVisited);
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < n; i++) {
        //     sb.append(ans.get(k - 1).get(i));
        // }
        // return sb.toString();

        this.count = k;
        boolean[] isVisited = new boolean[n];
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(list, n, isVisited);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }


    // 最朴素的完全回溯方法，会超时，而且空间复杂度也大
    // private void backtrack(List<List<Integer>> ans, LinkedList<Integer> list, int n, boolean[] isVisited) {
    //     if (list.size() == n) {
    //         ans.add(new LinkedList<>(list));
    //         return;
    //     }
    //     for (int i = 1; i <= n; i++) {
    //         if(isVisited[i-1]) continue;
    //         list.add(i);
    //         isVisited[i-1] = true;
    //         backtrack(ans, list, n, isVisited);
    //         isVisited[i-1] = false;
    //         list.removeLast();
    //     }
    // }

    private void backtrack(LinkedList<Integer> list, int n, boolean[] isVisited) {
        if (list.size() == n) {
            count--;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(isVisited[i-1]) continue;
            list.add(i);
            isVisited[i-1] = true;
            backtrack(list, n, isVisited);
            if(count==0) return;
            isVisited[i-1] = false;
            list.removeLast();
        }
    }
}
// @lc code=end

