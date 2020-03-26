1. 数组
    + 提到数组，并且有苛刻条件，比如说控制空间复杂度，可以考虑**排序操作**；
    + 给定正数且不重复数组nums，考虑方法nums的元素值与新数组的下标相对应的方法。即numsIndex[nums[i]] = i;即把nums的值当作numsIndex的索引，即numsIndex中nums元素越大越靠后。

2. 二叉树
    + **中序遍历**二叉搜索树得到的是递增序列
    + 遍历的方法：迭代和递归

3. 链表
    + **快慢双指针**（fast=2n, slow = n; fast = 1+n, slow = n)
    + **递归**：交换链表节点（24），反转链表（递归理解：https://lyl0724.github.io/2020/01/25/1/）
    + **尾插法**：（86）
    + **头插法**
    + 想象，改指针而不动元素（翻转链表）

4. 二分法
    + 时刻注意二分条件（left<=right）的等号！
    + 中间值mid的写法
        + (left+right)/2 (初级写法，有相加溢出的风险)
        + left + (right - left)/2 （中级写法，一定程度上避免了相加的大数溢出，但是当left为很小的负数，也有溢出的可能）
        + (left+right)>>>1 （高级写法，源于java源码binarySearch的写法[总结](https://leetcode-cn.com/problems/guess-number-higher-or-lower/solution/shi-fen-hao-yong-de-er-fen-cha-zhao-fa-mo-ban-pyth/)）

5. 回溯
    + 关键因素：外层循环（有时也没有）+内层的backtrack方法：
        + backtrack方法每次的起始点，即外层循环给的值
    + 本质就是深度遍历，但是在backtrack方法中加上了往下一层传递的参数（129）

6. 位运算
    + x/2 = x>>1, x%2 = x & 1
    + a^b^c = a^c^b, a^a=0, 0^a=a

7. 卡int边界值时，不妨把int用Integer代替，不用设Interger.MAX_VALUE，直接赋初始值为null

8. **宏观的**去认识这个递归是完成什么功能，关注其结果即可，再对结果进行操作！（114, 222）

