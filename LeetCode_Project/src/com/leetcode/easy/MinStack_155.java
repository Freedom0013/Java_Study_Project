package com.leetcode.easy;

import java.util.Stack;

/**
 * 设计最小栈
 * Question：
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * 		push(x) 	-- 将元素 x 推入栈中。
 * 		pop() 		-- 删除栈顶的元素。
 * 		top() 		-- 获取栈顶元素。
 * 		getMin() 	-- 检索栈中的最小元素。
 * 	示例:
 * 		MinStack minStack = new MinStack();
 * 		minStack.push(-2);
 * 		minStack.push(0);
 * 		minStack.push(-3);
 * 		minStack.getMin();   --> 返回 -3.
 * 		minStack.pop();
 * 		minStack.top();      --> 返回 0.
 * 		minStack.getMin();   --> 返回 -2.
 * Title: MinStack_155
 * @date 2018年5月30日
 * @author Freedom0013
 */
public class MinStack_155 {
	private Stack<Integer> s1 = null;
	private Stack<Integer> s2 = null;
	
	public MinStack_155() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
    
    public void push(int x) {
    	s1.push(x);
        if (s2.isEmpty() || s2.peek() >= x){
        	s2.push(x);
        }
    }
    
    public void pop() {
    	int x = s1.pop();
        if (s2.peek() == x){
        	s2.pop();
        }
    }
    
    public int top() {
    	return s1.peek();
    }
    
    public int getMin() {
    	return s2.peek();
    }
}
