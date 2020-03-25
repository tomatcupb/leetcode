import java.util.Stack;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            System.out.println("no elements");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        int last = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return last;
    }
    
    /** Get the front element. */
    public int peek() {
        if(empty()){
            System.out.println("no elements");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        int last = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return last;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()? true:false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

