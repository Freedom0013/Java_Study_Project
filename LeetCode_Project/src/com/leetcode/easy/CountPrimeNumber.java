package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #204   计数质数
 * Question：
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例:
 * 		输入: 10
 * 		输出: 4
 * 		解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * Title: CountPrimeNumber
 * @date 2018年6月6日
 * @author Freedom0013
 */
public class CountPrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要计数的整数：");
		try {
			int target = sc.nextInt(); 
			System.out.println("输入的是：" + target);
			System.out.println("质数的数量为：" + countPrimes(target));
		} catch (InputMismatchException e) {
			System.out.println("输入的值过大！");
		}
	}
	
	/**
	 * 统计小于n的质数总数
	 * @param n 被统计的数
	 * @return 质数数量
	 */
	public static int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}
		boolean[] flag = new boolean[n]; 		// 默认所有的元素值都会设置为false
		flag[0] = true;
		flag[1] = true;
		// 如果i是一个质数，i将i的倍数设置为非质数，如是i是一个合数，则它必定已经设置为true了，因为是从2开始处理的
		for (int i = 2; i * i < n; i++) {
			if (!flag[i]) {
				for (int j = 2 * i; j < n; j += i) {
					System.out.println(i+","+j);
					flag[j] = true;
				}
			}
		}
		int res = 0;
		for (boolean b : flag) {
			if (!b) {
				res++;
			}
		}
		return res;
    }
}
