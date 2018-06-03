package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #633   平方数之和
 * Question：
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a^2 + b^2 = c。
 * 示例1:
 * 		输入: 5
 * 		输出: True
 * 		解释: 1 * 1 + 2 * 2 = 5
 * 示例2:
 * 		输入: 3
 * 		输出: False
 * Title: SumSquare_633
 * @date 2018年6月3日
 * @author Freedom0013
 */
public class SumSquare_633 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的非负整数：");
		try {
			int targetNum = sc.nextInt();
			System.out.println("输入的是：" + targetNum);
			System.out.println("结果：" + judgeSquareSum(targetNum));
		} catch (InputMismatchException e) {
			System.out.println("输入的值过大！");
		}
	}
	
	public static boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}
		int max = (int) Math.sqrt(c); 						
		for (int i = 0; i <= max; i++) { 					
			double test = Math.sqrt(c - i * i);
			System.out.println(test+","+i);
			if (test - (int) test == 0) {
				System.out.println("--"+test+","+i);
				return true;
			}
		}
		return false;
	}
}
