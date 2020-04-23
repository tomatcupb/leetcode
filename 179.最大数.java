import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums){
        String[] strs = new String[nums.length];
        for(int i = 0; i< nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //返回正值 交换；负值不交换
                return -(o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        if(strs[0].equals("0")) return "0";
        for(String str: strs){
            sb.append(str);
        }
        return sb.toString();
    }

    // private int compare(int num1, int num2){
        // 这种粗暴的compare方法有错误，如2,2281
        // String str1 = String.valueOf(num1);
        // String str2 = String.valueOf(num2);
        // int len1 = str1.length();
        // int len2 = str2.length();
        // int i = 0;
        // for(i = 0; i< Math.min(len1, len2); i++){
        //     if(str1.charAt(i)>str2.charAt(i)){
        //         return 1;
        //     } else if(str1.charAt(i)<str2.charAt(i)){
        //         return -1;
        //     }
        // }
        // if(i==len1 && i!=len2){
        //     return str2.charAt(i)>str2.charAt(0)?-1:1;
        // } else if(i==len2 && i!=len1){
        //     return str1.charAt(i)>str1.charAt(0)?1:-1;
        // }
        // return 0;

        // 更加简单高效的比较办法
    //     String str1 = num1+""+num2;
    //     String str2 = num2+""+num1;
    //     return str1.compareTo(str2);
        
    // }


    // 自己写的快排会超时
    // private void sort(int[] nums, int left, int right){
    //     int l = left;
    //     int r = right;
    //     int pivot = nums[(l+r)/2];
    //     while(l<r){
    //         while(compare(nums[l], pivot)>0) l++;
    //         while(compare(nums[r], pivot)<0) r--;
    //         if(l==r) break;

    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;

    //         if(nums[l]==pivot) r--;
    //         if(nums[r]==pivot) l++;
    //     }
    //     if(l==r){
    //         l++;
    //         r--;
    //     }
    //     if(r>left) sort(nums, left, r);
    //     if(l<right) sort(nums, l, right);
    // }
}
// @lc code=end

