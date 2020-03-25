import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 =  new LinkedList<>();
        queue2 =  new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            System.out.println("no elements!");
            return -1;
        }
        while(queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        int last = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return last;
    }
    
    /** Get the top element. */
    public int top() {
        if(empty()){
            System.out.println("no elements!");
            return -1;
        }
        while(queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        int last = queue1.poll();
        queue2.add(last);
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return last;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.size() == 0 ? true:false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

