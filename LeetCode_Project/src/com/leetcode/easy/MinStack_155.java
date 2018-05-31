package com.leetcode.easy;

import java.util.Stack;

/**
 * �����Сջ
 * Question��
 * ���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��
 * 		push(x) 	-- ��Ԫ�� x ����ջ�С�
 * 		pop() 		-- ɾ��ջ����Ԫ�ء�
 * 		top() 		-- ��ȡջ��Ԫ�ء�
 * 		getMin() 	-- ����ջ�е���СԪ�ء�
 * 	ʾ��:
 * 		MinStack minStack = new MinStack();
 * 		minStack.push(-2);
 * 		minStack.push(0);
 * 		minStack.push(-3);
 * 		minStack.getMin();   --> ���� -3.
 * 		minStack.pop();
 * 		minStack.top();      --> ���� 0.
 * 		minStack.getMin();   --> ���� -2.
 * Title: MinStack_155
 * @date 2018��5��30��
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
