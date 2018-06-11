package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #9  回文数
 * Question：
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 		输入: 121
 * 		输出: true
 * 示例 2:
 * 		输入: -121
 * 		输出: false
 * 		解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * 		输入: 10
 * 		输出: false
 * 		解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * Title: PalindromeNumber_9
 * @date 2018年6月11日
 * @author Freedom0013
 */
public class PalindromeNumber_9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要判断的整数：");
		try {
			int target = sc.nextInt(); 
			System.out.println("输入的是：" + target);
			System.out.println("是否为回文数：" + isPalindrome(target));
		} catch (InputMismatchException e) {
			System.out.println("输入的值过大！");
		}
	}
	
	/**
	 * 判断回文数
	 * @param x 被测数字
	 * @return 结果
	 */
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x == overthrow(x)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 翻转数字
	 * @param input 输入
	 * @return 翻转结果
	 */
	public static int overthrow(int input) {
		int output = 0;
		while (input > 0) {
			output = output * 10 + input % 10;
			input = input / 10;
		}
		return output;
	} 
}
