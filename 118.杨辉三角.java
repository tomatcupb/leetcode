import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> listOuter = new ArrayList<List<Integer>>();
        // if(numRows == 0){
        //     return listOuter;
        // }
        // if(numRows == 1){
        //     List<Integer> listInner1 = new ArrayList<>();
        //     listInner1.add(1);
        //     listOuter.add(listInner1);
        //     return listOuter;            
        // }
        // if(numRows == 2){
        //     List<Integer> listInner1 = new ArrayList<>();
        //     listInner1.add(1);
        //     listOuter.add(listInner1);
        //     List<Integer> listInner2 = new ArrayList<>();
        //     listInner2.add(1);
        //     listInner2.add(1);
        //     listOuter.add(listInner2);
        //     return listOuter;    

        // }

        // List<Integer> listInner1 = new ArrayList<>();
        // listInner1.add(1);
        // listOuter.add(listInner1);
        // List<Integer> listInner2 = new ArrayList<>();
        // listInner2.add(1);
        // listInner2.add(1);
        // listOuter.add(listInner2);
        // int n = 2;
        // while(n<numRows){
        //     List<Integer> lastRow = listOuter.get(n-1);
        //     List<Integer> newRow = new ArrayList<>();
        //     newRow.add(1);
        //     for (int i = 1; i < n; i++) {
        //         int num = lastRow.get(i - 1) + lastRow.get(i);
        //         newRow.add(num);
        //     }
        //     newRow.add(1);
        //     listOuter.add(newRow);
        //     n++;
        // }
        // return listOuter;


    /**
     * 这样看会简单很多！！
     * 帕斯卡三角形
     *  1
     *  1 1
     *  1 2 1
     *  1 3 3 1
     *  1 4 6 4 1
     *  1 5 10 10 5 1
     * @param numRows
     * @return
     */
        List<List<Integer>> listOuter = new ArrayList<List<Integer>>();
        for(int i = 0; i< numRows; i++){
            List<Integer> listInner = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(i == j || j==0){
                    listInner.add(1);
                } else{
                    int num = listOuter.get(i-1).get(j) + listOuter.get(i-1).get(j-1);
                    listInner.add(num);
                }
            }
            listOuter.add(listInner);
        }
        return listOuter;
    }
}
// @lc code=end

