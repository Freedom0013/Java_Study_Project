package com.leetcode.hard;

import java.util.Scanner;
import java.util.Stack;

/**
 * #224  Basic Calculator
 * Question：
 * 实现一个基本的计算器来计算一个简单的字符串表达式的值。
 * 字符串表达式可以包含左括号 ( ，右括号 )，加号 + ，减号 -，非负整数和空格。
 * 示例 1:
 * 		输入: "1 + 1"
 * 		输出: 2
 * 示例 2:
 * 		输入: " 2-1 + 2 "
 * 		输出: 3
 * 示例 3:
 * 		输入: "(1+(4+5+2)-3)+(6+8)"
 * 		输出: 23
 * Title: BasicCalculator_224
 * @date 2018年6月12日
 * @author Freedom0013
 */
public class BasicCalculator_224 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要计算的表达式：");
		String target = sc.nextLine();
		System.out.println("输入的表达式为：" + target);
		System.out.println("计算结果为：" + calculate(target));
	}
	
	/**
	 * 基础计算器
	 * @param s 计算表达式
	 * @return 结果
	 */
	public static int calculate(String s) {
		if (s == null || s.trim().length() == 0) {
			return 0;
		}
		char[] chs = s.toCharArray();
		// 创建栈应对括号优先计算
		Stack<Integer> stack = new Stack<>();
		// 计算结果
		int result = 0;
		// 数字符号标记
		int operator = 1;
		stack.push(1);
		for (int i = 0; i < chs.length; i++) {
			// 判断是否为数字
			if (Character.isDigit(chs[i])) {
				int num = chs[i] - '0';
				int next = i + 1;
				while (next < chs.length && Character.isDigit(chs[next])) {
					num = num * 10 + chs[next] - '0';
					next++;
				}
				// 因为只有加减法，减去正数等于加上负数
				result += operator * stack.peek() * num;
				i = next - 1;
			} else if (chs[i] == '+') {
				operator = 1;
			} else if (chs[i] == '-') {
				operator = -1;
			} else if (chs[i] == '(') {
				// 入栈括号元素
				stack.push(operator * stack.peek());
				// 初始符号
				operator = 1;
			} else if (chs[i] == ')') {
				// 括号结束出栈
				stack.pop();
			} else {
				// 空格
			}
		}
		return result;
	}
}
