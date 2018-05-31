package com.leetcode.test;

import com.leetcode.easy.MinStack_155;

/**
 * 综合测试类
 * Title: Test
 * @date 2018年5月30日
 * @author Freedom0013
 */
public class Test {
	public static void main(String[] args) {
		//-----------------------------#155---------------------------------
		MinStack_155 stack = new MinStack_155();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		stack.pop();
		int param_top = stack.top();
		int param_min = stack.getMin();
		System.out.println("param_top = "+param_top+",param_min = "+param_min);
	}
}
