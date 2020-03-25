import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> list;
    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        if(x<=min){
            list.add(min);
            min = x;
        }
        list.add(x);
    }
    
    public void pop() {
        if(list.size() == 0){
            System.out.println("no element!");
            return;
        }
        if(top() == min){
            list.remove(list.size()-1);
            min = top();
            list.remove(list.size()-1);
        } else{
            list.remove(list.size()-1);
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        if(list.size() == 0){
            System.out.println("no element!");
            return Integer.MAX_VALUE;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

