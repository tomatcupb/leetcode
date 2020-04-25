/*
 * @lc app=leetcode.cn id=223 lang=java
 *
 * [223] 矩形面积
 */

// @lc code=start
class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return (C-A)*(D-B)+(G-E)*(H-F) - isOverlapped(A, B, C, D, E, F, G, H);
    }

    private int isOverlapped(int A, int B, int C, int D, int E, int F, int G, int H){
        int ans = 0;
        int x = Math.max(G-A, C-E);
        int y = Math.max(D-F, H-B);
        if(x<(C-A+G-E)&&y<(D-B+H-F)){
            int h = (C-A+G-E) - Math.max(Math.max(G-A, C-E), Math.max(C-A, G-E));
            int w = (D-B+H-F) - Math.max(Math.max(D-F, H-B), Math.max(D-B, H-F));
            ans = h*w;
        }
        return ans;
    }
}
// @lc code=end

