package com.leetcode.easy;

import java.util.Scanner;

/**
 * #69   x 的平方根
 * Question：
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 * Title: MySqrtExample
 * @date 2018年6月4日
 * @author Freedom0013
 */
public class MySqrtExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要计算的整数：");
		try {
			int targetNum = sc.nextInt();
			System.out.println("输入的是：" + targetNum);
			System.out.println("平方根为：" + mySqrt(targetNum));
		} catch (Exception e) {
			System.out.println("输入的值有误！");
		}
	}

	/**
	 * 计算平方根
	 * 
	 * 牛顿迭代公式
	 * 		设r是f(x) = 0的根，选取x0作为r初始近似值，过点(x0,f(x0))做曲线y = f(x)的切线L
	 * 		L的方程为:y = f(x0) + f'(x0)(x-x0)
	 * 		求出L与x轴交点的横坐标 x1 = x0-f(x0)/f'(x0)称x1为r的一次近似值。
	 * 		过点(x1,f(x1))做曲线y = f(x)的切线
	 * 		并求该切线与x轴交点的横坐标 x2 = x1-f(x1)/f'(x1)，称x2为r的二次近似值。
	 *		重复以上过程，得r的近似值序列，其中x(n+1）=x(n)－f(x(n))/f'(x(n))，称为r的n+1次近似值，上式称为牛顿迭代公式。
	 * 
	 * @param x 要计算的数
	 * @return 平方根
	 */
	public static int mySqrt(int x) {
		double pre = 0;
		double cur = x; 			
		while (Math.abs(cur - pre) > 0.000001) {
			pre = cur;
			cur = (pre / 2 + x / (2 * pre));
		}
		return (int) cur;
    }
}
