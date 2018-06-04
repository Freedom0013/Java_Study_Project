package com.leetcode.easy;

import java.util.Scanner;

/**
 * #7  反转整数
 * Question：
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:		|	示例 2:		|	示例 3:
 * 输入: 123		|	输入: -123	|	输入: 120
 * 输出: 321		|	输出: -321	|	输出: 21
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [ −2^32 ~ 2^32 − 1]。
 * 根据这个假设，如果反转后的整数溢出，则返回 0。
 * Title: RotateIntNum_7
 * @date 2018年6月1日（祝大家儿童节快乐！）
 * @author Freedom0013
 */
public class RotateIntNum_7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要反转的整数：(数值范围为:−2^32 ~ 2^32 − 1)");
		try {
			int targetNum = sc.nextInt();
			System.out.println("输入的是：" + targetNum);
			System.out.println("反转后为：" + reverse(targetNum));
		} catch (Exception e) {
			System.out.println("输入的值有误！");
		}
	}
	
	/**
	 * 反转数字
	 * @param x 整数
	 * @return 反转后值
	 */
	public static int reverse(int x) {
		int res = 0;
		while (x != 0) {
			int num = x % 10;
			int testres = res * 10 + num;
			if ((testres - num) / 10 != res) {
//				System.out.println("num = " + num + ",testres = " + testres + ",res = " + res);
				return 0;
			}
			res = testres;
			x = x / 10;
//			System.out.println("num = " + num + ",testres = " + testres + ",res = " + res);
		}
		return res;
    }
}
